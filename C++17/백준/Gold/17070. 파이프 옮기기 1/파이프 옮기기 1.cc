#include <bits/stdc++.h>
using namespace std;

int N;
bool wall[17][17];
int dp[17][17][3];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    for ( int i = 1 ; i <= N ; i++ )
        for ( int j = 1 ; j <= N ; j++ ) 
            cin >> wall[i][j];
        
    dp[1][2][0] = 1;
    
    for ( int c = 3 ; c <= N ; c++ )
        if ( !wall[1][c] )
            dp[1][c][0] = dp[1][c-1][0];

    for ( int r = 2 ; r <= N ; r++ )
        for ( int c = 3 ; c <= N ; c++ )
            if ( !wall[r][c] ) {
                dp[r][c][0] = dp[r][c-1][0] + dp[r][c-1][2];
                dp[r][c][1] = dp[r-1][c][1] + dp[r-1][c][2];
                if ( !wall[r-1][c] && !wall[r][c-1] )
                    dp[r][c][2] = dp[r-1][c-1][0] + dp[r-1][c-1][1] + dp[r-1][c-1][2];
            }

    int result = dp[N][N][0] + dp[N][N][1] + dp[N][N][2];
    cout << result;
    
    return 0;    
}
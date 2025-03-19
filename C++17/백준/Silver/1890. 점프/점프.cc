#include <bits/stdc++.h>
using namespace std;
using ll = long long;
int N;
int jump[101][101];
ll dp[101][101];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    for ( int i = 0 ; i < N ; i++ )
        for ( int j = 0 ; j < N ; j++ )
            cin >> jump[i][j];

    dp[0][0] = 1;

    for ( int i = 0 ; i < N ; i++ ) 
        for ( int j = 0 ; j < N ; j++ ) {
            if ( dp[i][j] == 0 || jump[i][j] == 0 || i == N-1 && j == N-1 ) continue;

            int jmp = jump[i][j];
            int dn = jmp+i;
            int ri = jmp+j;

            if ( dn < N ) dp[dn][j] += dp[i][j];
            if ( ri < N ) dp[i][ri] += dp[i][j];
        }

    cout << dp[N-1][N-1];
    return 0;
}
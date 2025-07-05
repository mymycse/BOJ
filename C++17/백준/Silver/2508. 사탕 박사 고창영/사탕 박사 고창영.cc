#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int T, r, c;
    cin >> T;
    
    while ( T-- ) {
        cin >> r >> c;
        char candy[r][c];
        for ( int i = 0 ; i < r ; i++ )
            for ( int j = 0 ; j < c ; j++ )
                cin >> candy[i][j];
        
        int cnt = 0;
        for ( int i = 0 ; i < r ; i++ ) {
            for ( int j = 0 ; j < c ; j++ ) {
                if ( candy[i][j] == '>' ) {
                    if ( j+2 >= c ) continue;
                    if ( candy[i][j+1] == 'o' && candy[i][j+2] == '<' ) cnt++;
                }
                else if ( candy[i][j] == 'v' ) {
                    if ( i+2 >= r ) continue;
                    if ( candy[i+1][j] == 'o' && candy[i+2][j] == '^' ) cnt++;
                }
            }
        }
        
        cout << cnt << '\n';
    }
}
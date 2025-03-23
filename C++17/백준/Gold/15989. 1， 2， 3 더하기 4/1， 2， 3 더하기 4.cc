#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int T, n;
    int dp[10001][4];
    cin >> T;

    dp[1][1] = 1;
    dp[1][2] = dp[1][3] = 0;
    dp[2][1] = dp[2][2] = 1;
    dp[2][3] = 0;
    dp[3][1] = dp[3][2] = dp[3][3] = 1;

    while ( T-- ) {
        cin >> n;

        for ( int i = 4 ; i <= n ; i++ ) {
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][1] + dp[i-2][2];
            dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
        }

        int result = dp[n][1] + dp[n][2] + dp[n][3];
        cout << result << '\n';
    }
}
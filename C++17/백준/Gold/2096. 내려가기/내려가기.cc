#include <bits/stdc++.h>
using namespace std;

int N, a, b, c;
int dp[2][3][2];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    int k = 0;

    for ( int i = 0 ; i < N ; i++ ) {
        cin >> a >> b >> c;
        dp[k][0][0] = a + max(dp[1-k][0][0], dp[1-k][1][0]);
        dp[k][1][0] = b + max(dp[1-k][0][0], max(dp[1-k][1][0], dp[1-k][2][0]));
        dp[k][2][0] = c + max(dp[1-k][1][0], dp[1-k][2][0]);

        dp[k][0][1] = a + min(dp[1-k][0][1], dp[1-k][1][1]);
        dp[k][1][1] = b + min(dp[1-k][0][1], min(dp[1-k][1][1], dp[1-k][2][1]));
        dp[k][2][1] = c + min(dp[1-k][1][1], dp[1-k][2][1]);

        k = 1-k;
    }

    k = 1-k;

    int maxRes = max(dp[k][0][0], max(dp[k][1][0], dp[k][2][0]));
    int minRes = min(dp[k][0][1], min(dp[k][1][1], dp[k][2][1]));

    cout << maxRes << ' ' << minRes;

    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int N, M, K, i, j, a, b;
    cin >> N >> M >> K;

    char bd[N][M];
    for ( i = 0 ; i < N ; i++ )
        for ( j = 0 ; j < M ; j++ )
            cin >> bd[i][j];

    int r = N/K;
    int c = M/K;
    int res = 0;

    for ( i = 0 ; i < K ; i++ ) {
        for ( j = 0 ; j < K ; j++ ) {
            int cnt[26];
            int max_idx = 0;
            fill_n(cnt, 26, 0);

            for ( a = 0 ; a < r ; a++ ) {
                for ( b = 0 ; b < c ; b++ ) {
                    int idx = bd[a*K+i][b*K+j]-'A';
                    cnt[idx]++;

                    if ( cnt[idx] > cnt[max_idx] ) {
                        max_idx = idx;
                    }
                }
            }

            res += (r*c - cnt[max_idx]);
            for ( a = 0 ; a < r ; a++ ) {
                for ( b = 0 ; b < c ; b++ ) {
                    bd[a*K+i][b*K+j] = 'A'+max_idx;
                }
            }
        }
    }

    cout << res << '\n';
    for ( i = 0 ; i < N ; i++ ) {
        for ( j = 0 ; j < M ; j++ )
            cout << bd[i][j];
        cout << '\n';
    }
    return 0;
}
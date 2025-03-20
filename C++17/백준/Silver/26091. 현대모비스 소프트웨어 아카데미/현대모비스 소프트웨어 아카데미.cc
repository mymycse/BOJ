#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int N, M;
ll pw[100001];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;

    for ( int i = 0 ; i < N ; i++ )
        cin >> pw[i];

    sort(pw,pw+N);

    int cnt = 0;
    int st = 0;
    int en = N-1;

    while ( st < en ) {
        int temp = pw[st] + pw[en];

        if ( temp >= M ) {
            cnt++;
            st++; en--;
        }
        else if ( temp < M )
            st++;
    }

    cout << cnt;
    return 0;
}
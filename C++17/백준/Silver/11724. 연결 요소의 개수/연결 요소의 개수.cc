#include <bits/stdc++.h>
using namespace std;

int N, M, u, v;
vector<int> gph[1001];
bool b[1001];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;

    for ( int i = 0 ; i < M ; i++ ) {
        cin >> u >> v;
        gph[u].push_back(v);
        gph[v].push_back(u);
    }

    int cnt = 0;
    fill(b, b+(N+1), false);

    for ( int i = 1 ; i <= N ; i++ ) {
        if ( b[i] ) continue;
        queue<int> qu;
        qu.push(i);
        b[i] = true;

        while ( !qu.empty() ) {
            int cur = qu.front();
            qu.pop();

            for ( auto k : gph[cur] ) {
                if ( b[k] ) continue;
                qu.push(k);
                b[k] = true;
            }
        }

        cnt++;
    }

    cout << cnt;
    return 0;
}
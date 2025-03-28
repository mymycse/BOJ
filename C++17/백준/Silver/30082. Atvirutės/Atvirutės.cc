#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int M, N, K, u, v;
    cin >> N >> M >> K;

    bool b[N+1] = {false};
    vector<int> rsp[N+1];
    queue<int> qu;
    int cnt = 0;

    for ( int i = 0 ; i < M ; i++ ) {
        cin >> u;
        qu.push(u);
        b[u] = true;
        cnt++;
    }

    for ( int i = 0 ; i < K ; i++ ) {
        cin >> u >> v;
        rsp[u].push_back(v);
        rsp[v].push_back(u);
    }

    while ( !qu.empty() ) {
        int cur = qu.front();
        qu.pop();

        for ( auto frd : rsp[cur] ) {
            if ( b[frd] ) continue;
            qu.push(frd);
            b[frd] = true;
            cnt++;
        }
    }

    cout << cnt;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int N, M;
vector<pair<int,int>> adj[1001];

void dist(int st, int en) {
    queue<pair<int,int>> qu;
    vector<bool> vis(N+1);
    qu.push({st,0});
    vis[st] = true;

    while ( !qu.empty() ) {
        int cur = qu.front().first;
        int d = qu.front().second;
        qu.pop();

        if ( cur == en ) {
            cout << d << '\n';
            return;
        }
        for ( auto [nxt, nxtdist] : adj[cur] ) {
            if ( vis[nxt] ) continue;
            vis[nxt] = true;
            qu.push({nxt, d+nxtdist});
        }
    }
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int u, v, d;
    cin >> N >> M;

    for ( int i = 1 ; i < N ; i++ ) {
        cin >> u >> v >> d;
        adj[u].push_back({v,d});
        adj[v].push_back({u,d});
    }

    for ( int i = 0 ; i < M ; i++ ) {
        cin >> u >> v;
        dist(u,v);
    }
    return 0;
}
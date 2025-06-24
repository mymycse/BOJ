#include <bits/stdc++.h>
using namespace std;

int res = INT_MAX;
int N, M, idx;
vector<int> adj[101];

void dfs(int st) {
    int dist[N+1];
    fill(dist, dist+N+1, -1);
    dist[st] = 0;
    int score = 0;

    queue<int> qu;
    qu.push(st);

    while ( !qu.empty() ) {
        int cur = qu.front(); qu.pop();

        for ( int nxt : adj[cur] ) {
            if ( dist[nxt] != -1 ) continue;
            dist[nxt] = dist[cur]+1;
            score += dist[nxt];
            qu.push(nxt);
        }
    }

    if ( score < res || ( score == res && st < idx ) ) {
        idx = st;
        res = score;
    }
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    cin >> N >> M;

    int a, b;
    for ( int i = 0 ; i < M ; i++ ) {
        cin >> a >> b;
        adj[a].push_back(b);
        adj[b].push_back(a);
    }

    for ( int i = 1 ; i <= N ; i++ )
        dfs(i);

    cout << idx;
    return 0;
}
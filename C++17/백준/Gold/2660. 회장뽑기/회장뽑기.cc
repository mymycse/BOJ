#include <bits/stdc++.h>
using namespace std;

int n;
int score[51];
bool adj[51][51];

void bfs() {
    for ( int i = 1 ; i <= n ; i++ ) {
        int dist[n+1];
        fill(dist, dist+n+1, -1);
        dist[i] = 0;

        queue<int> qu;
        qu.push(i);

        while ( !qu.empty() ) {
            int cur = qu.front(); qu.pop();

            for ( int nxt = 1 ; nxt <= n ; nxt++ ) {
                if ( !adj[cur][nxt] ) continue;
                if ( dist[nxt] != -1 ) continue;
                dist[nxt] = dist[cur]+1;
                qu.push(nxt);
            }
        }
        int far = *max_element(dist+1, dist+n+1);
        score[i] = far;
    }
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    cin >> n;

    int a, b;
    while ( true ) {
        cin >> a >> b;
        if ( a == -1 && b == -1 ) break;
        adj[a][b] = 1;
        adj[b][a] = 1;
    }

    bfs();

    int min_score = *min_element(score+1, score+n+1);
    vector<int> cand;
    for ( int i = 1 ; i <= n ; i++ ) {
        if ( score[i] == min_score )
            cand.push_back(i);
    }

    cout << min_score << ' ' << cand.size() << '\n';
    for ( int cnd : cand ) cout << cnd << ' ';

    return 0;
}
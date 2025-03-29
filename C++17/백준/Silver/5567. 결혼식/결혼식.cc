#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m, a, b;
    cin >> n >> m;

    vector<int> frd[501];
    bool vis[501];
    fill(vis, vis+501, false);

    for ( int i = 0 ; i < m ; i++ ) {
        cin >> a >> b;
        frd[a].push_back(b);
        frd[b].push_back(a);
    }

    queue<pair<int,int>> qu;
    qu.push({1,0});
    vis[1] = true;
    int cnt = 0;

    while ( !qu.empty() ) {
        int cur = qu.front().first;
        int rel = qu.front().second;
        qu.pop();

        for ( auto nxt : frd[cur] ) {
            if ( vis[nxt] || rel > 1 ) continue;
            qu.push({nxt, rel+1});
            vis[nxt] = true;
            cnt++;
        }
    }

    cout << cnt;
    return 0;
}
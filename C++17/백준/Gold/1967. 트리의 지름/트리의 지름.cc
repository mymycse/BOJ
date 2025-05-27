#include <bits/stdc++.h>
using namespace std;

vector<pair<int, int>> node[10001];
bool vis[10001];
int point, res = 0;

void dfs(int v, int len) {
    if(vis[v]) return;
    
    vis[v] = true;
    if ( res < len ) {
        res = len;
        point = v;
    }

    for ( auto& nxt : node[v] )
        dfs(nxt.first, len+nxt.second);
}

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);

    int n, a, b, w;
    cin >> n;
    for ( int i = 1 ; i < n ; i++ ) {
        cin >> a >> b >> w;
        node[a].push_back({b, w});
        node[b].push_back({a, w});
    }

    dfs(1,0);
    res = 0;
    fill(vis, vis+10001, false);
    dfs(point, 0);

    cout << res;
    return 0;
}
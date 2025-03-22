#include <bits/stdc++.h>
using namespace std;

int n, x, y, m, u, v, d;
vector<int> gph[101];
bool b[101];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> n >> x >> y >> m;

    for ( int i = 0 ; i < m ; i++ ) {
        cin >> u >> v;
        gph[u].push_back(v);
        gph[v].push_back(u);
    }

    int cnt = 0;
    
    queue<pair<int,int>> qu;
    qu.push({x,0});
    b[x] = true;

    while ( !qu.empty() ) {
        int cur = qu.front().first;
        int d = qu.front().second;
        qu.pop();

        if ( cur == y ) {
            cout << d;
            return 0;
        }

        for ( auto k : gph[cur] ) {
            if ( b[k] ) continue;
            qu.push({k, d+1});
            b[k] = true;
        }
    }

    cout << -1;
    return 0;
}
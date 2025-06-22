#include <bits/stdc++.h>
using namespace std;

int n;
bool adj[101][101];
bool vis[101];

bool dfs(int s, int t) {
    fill(vis, vis+n+1, 0);
    stack<int> stk;
    stk.push(s);

    while ( !stk.empty() ) {
        int cur = stk.top();
        stk.pop();

        if ( vis[cur] ) continue;
        if ( cur != s ) vis[cur] = 1;

        for ( int k = 0 ; k < n ; k++ ) {
            if ( vis[k] ) continue;
            if ( adj[cur][k] ) {
                if ( k == t ) return true;
                stk.push(k);
            }
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    cin >> n;
    for ( int i = 0 ; i < n ; i++ )
        for ( int j = 0 ; j < n ; j++ )
            cin >> adj[i][j];

    for ( int i = 0 ; i < n ; i++ ) {
        for ( int j = 0 ; j < n ; j++ )
            cout << dfs(i,j) << ' ';
        cout << '\n';
    }
    return 0;
}
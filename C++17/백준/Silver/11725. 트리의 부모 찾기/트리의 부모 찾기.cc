#include <bits/stdc++.h>
using namespace std;

int N;
vector<int> tree[100001];
int parent[100001];

void dfs(int cur) {
    for ( int next : tree[cur] ) {
        if ( parent[cur] == next )  continue;
        parent[next] = cur;
        dfs(next);
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    for ( int i = 0 ; i < N-1 ; i++ ) {
        int u,v;
        cin >> u >> v;
        tree[u].push_back(v);
        tree[v].push_back(u);
    }

    dfs(1);
    for ( int i = 2 ; i <= N ; i++ )
        cout << parent[i] << '\n';
}
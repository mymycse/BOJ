#include <bits/stdc++.h>
using namespace std;

int T, N;
vector<int> followers[11];

void dfs( int cur, vector<bool>& visited ) {
    visited[cur] = true;
    for ( int next : followers[cur] ) {
        if ( !visited[next] ) dfs(next, visited);
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> T;
    for ( int tc = 1 ; tc <= T ; tc++ ) {
        cin >> N;

        // 초기화
        for ( int i = 1 ; i <= N ; i++ ) followers[i].clear();

        // 입력받고 역방향 그래프 구성
        for ( int i = 1 ; i <= N ; i++ ) {
            int f;
            cin >> f;
            followers[f].push_back(i); // i는 f의 follower
        }

        cout << "Case #" << tc << ":\n";
        // 각 날마다 시작 승려를 1~N까지
        for ( int start = 1 ; start <= N ; start++ ) {
            vector<bool> visited(N+1, false);
            dfs(start, visited);
            int cnt = 0;
            for ( int i = 1 ; i <= N ; i++ )
                if (visited[i]) cnt++;
            
            cout << cnt << '\n';
        }
    }
    return 0;
}
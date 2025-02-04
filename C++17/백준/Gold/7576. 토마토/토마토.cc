#include <bits/stdc++.h>
using namespace std;

int M, N;
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};
int cnt = 0, day = 0;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    queue<pair<int,int>> qu;
    cin >> N >> M;

    int tomato[M+1][N+1];
    
    for ( int i = 0 ; i < M ; i++ )
        for ( int j = 0 ; j < N ; j++ ) {
            cin >> tomato[i][j];
            if ( tomato[i][j] == 1 ) {
                cnt++;
                qu.push({i,j});
            } else if ( tomato[i][j] == -1 )
                cnt++;
        }

    while ( !qu.empty() ) {
        if ( cnt == N*M ) break;
        int tempSize = qu.size();
        while ( tempSize-- ) {
            auto cur = qu.front();
            qu.pop();

            for ( int dir = 0 ; dir < 4 ; dir++ ) {
                int nx = cur.first + dx[dir];
                int ny = cur.second + dy[dir];

                if ( nx < 0 || nx >= M || ny < 0 || ny >= N ) continue;
                if ( tomato[nx][ny] == -1 || tomato[nx][ny] == 1 ) continue;
            
                tomato[nx][ny] = 1;
                qu.push({nx,ny});
                cnt++;
            }
        }
        day++;
    }

    if ( cnt == N*M ) cout << day;
    else cout << -1;
}
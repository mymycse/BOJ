#include <bits/stdc++.h>
using namespace std;

int N, M;
char walls[1000][1000];
int dist[1000][1000][2];
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;

    for ( int i = 0 ; i < N ; i++ )
        for ( int j = 0 ; j < M ; j++ )
            cin >> walls[i][j];


    queue<tuple<int,int,int>> qu;
    qu.push({0,0,0});

    memset(dist, -1, sizeof(dist));
    dist[0][0][0] = dist[0][0][1] = 1;
    
    while ( !qu.empty() ) {
        int x = get<0>(qu.front());
        int y = get<1>(qu.front());
        int b = get<2>(qu.front());
        qu.pop();

        if ( x == N-1 && y == M-1 ) {
            cout << dist[x][y][b];
            return 0;
        }
        
        for ( int dir = 0 ; dir < 4 ; dir++ ) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if ( nx < 0 || nx >= N || ny < 0 || ny >= M ) continue;

            if ( dist[nx][ny][b] != -1 ) continue;

            if ( walls[nx][ny] == '0' ) {
                dist[nx][ny][b] = dist[x][y][b] + 1;
                qu.push({nx,ny,b});
            } 
            else if ( walls[nx][ny] == '1' && b == 0 && dist[nx][ny][1] == -1 ) {
                dist[nx][ny][1] = dist[x][y][b] + 1;
                qu.push({nx,ny,b+1});
            }
        }
    }

    cout << -1;
    return 0;
}
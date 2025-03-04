#include <bits/stdc++.h>
using namespace std;

int M, N, H;
int dx[6] = {1,0,-1,0,0,0};
int dy[6] = {0,1,0,-1,0,0};
int dz[6] = {0,0,0,0,1,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> M >> N >> H;
    int tomato[M][N][H];
    bool b[M][N][H];
    int cnt = N*M*H;
    queue<tuple<int,int,int>> qu;
    
    for ( int h = 0 ; h < H ; h++ ) 
        for ( int j = 0 ; j < N ; j++ )
            for ( int i = 0 ; i < M ; i++ ) {
                cin >> tomato[i][j][h];

                if ( tomato[i][j][h] == 1 ) {
                    qu.push({i,j,h});
                    cnt--;
                } 
                else if ( tomato[i][j][h] == -1 ) {
                    cnt--;
                }
            }

    if ( cnt == 0 ) {
        cout << 0;
        return 0;
    }
    
    int res = 0;

    while ( !qu.empty() ) {
        auto cur = qu.front();
        qu.pop();
        
        int x = get<0>(cur);
        int y = get<1>(cur);
        int z = get<2>(cur);

        for ( int dir = 0 ; dir < 6 ; dir++ ) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            int nz = z + dz[dir];

            if ( nx < 0 || nx >= M || ny < 0 || ny >= N || nz < 0 || nz >= H ) continue;
            if ( tomato[nx][ny][nz] != 0 ) continue;

            tomato[nx][ny][nz] = tomato[x][y][z] + 1;
            b[nx][ny][nz] = true;
            cnt--;
            res = max(res, tomato[nx][ny][nz]);

            qu.push({nx,ny,nz});
        }
    }

    if ( cnt == 0 ) cout << res-1;
    else cout << -1;
    
    return 0;
}
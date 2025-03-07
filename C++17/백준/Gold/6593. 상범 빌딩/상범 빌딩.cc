#include <bits/stdc++.h>
using namespace std;

int L, R, C;
char temp;
int dx[6] = {1,0,-1,0,0,0};
int dy[6] = {0,1,0,-1,0,0};
int dz[6] = {0,0,0,0,1,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    while ( true ) { 
        cin >> L >> R >> C;

        if ( L == 0 && R == 0 && C == 0 ) return 0;

        vector<vector<vector<int>>> building(L, vector<vector<int>>(R, vector<int>(C)));
        vector<vector<vector<bool>>> visited(L, vector<vector<bool>>(R, vector<bool>(C, false)));
        queue<tuple<int,int,int>> qu;

        for ( int i = 0 ; i < L ; i++ ) 
            for ( int j = 0 ; j < R ; j++ )
                for ( int k = 0 ; k < C ; k++ ) {
                    cin >> temp;
                    visited[i][j][k] = false;
                    if ( temp == '#' ) building[i][j][k] = -1;
                    else if ( temp == 'E' ) building[i][j][k] = -10;
                    else {
                        building[i][j][k] = 0;
                        if ( temp == 'S' ) {
                            visited[i][j][k] = true;
                            qu.push({i,j,k});
                        }
                    }
                }

        int res = 0;
        bool escape = false;
        while ( !qu.empty() ) {
            int x = get<0>(qu.front());
            int y = get<1>(qu.front());
            int z = get<2>(qu.front());
            qu.pop();

            for ( int dir = 0 ; dir < 6 ; dir++ ) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                int nz = z + dz[dir];

                if ( nx < 0 || nx >= L || ny < 0 || ny >= R || nz < 0 || nz >= C || visited[nx][ny][nz] ) continue;
                if ( building[nx][ny][nz] == -10 ) {
                    escape = true;
                    res = building[x][y][z] +1;
                    break;
                }

                if ( building[nx][ny][nz] == 0 ) {
                    building[nx][ny][nz] = building[x][y][z]+1;
                    visited[nx][ny][nz] = true;
                    qu.push({nx,ny,nz});
                }
            }
            
            if ( escape ) break;
        }

        if ( escape ) cout << "Escaped in " << res << " minute(s).\n";
        else cout << "Trapped!\n";
    }
}
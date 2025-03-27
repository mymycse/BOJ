#include <bits/stdc++.h>
using namespace std;

int M, N;
char mp[100][100];
bool b[100][100];
int dx[8] = {-1,-1,0,1,1,1,0,-1};
int dy[8] = {0,1,1,1,0,-1,-1,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> M >> N;
    for ( int i = 0 ; i < M ; i++ )
        for ( int j = 0 ; j < N ; j++ )
            cin >> mp[i][j];

    int cnt = 0;
    for ( int i = 0 ; i < M ; i++ ) {
        for ( int j = 0 ; j < N ; j++ ) {
            if ( mp[i][j] == '.' || b[i][j] ) continue;

            queue<pair<int,int>> qu;
            qu.push({i,j});
            b[i][j] = true;

            while ( !qu.empty() ) {
                int x = qu.front().first;
                int y = qu.front().second;
                qu.pop();

                for ( int dir = 0 ; dir < 8 ; dir++ ) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    if ( nx < 0 || nx >= M || ny < 0 || ny >= N ) continue;
                    if ( mp[nx][ny] == '.' || b[nx][ny] ) continue;

                    qu.push({nx,ny});
                    b[nx][ny] = true;
                }
            }

            cnt++;
        }
    }

    cout << cnt;
    return 0;
}
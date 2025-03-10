#include <bits/stdc++.h>
using namespace std;

int N;
int init[101][101];
bool numbering[101][101];
int land[101][101];
bool visited[101][101];
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    for ( int i = 0 ; i < N ; i++ ) 
        for ( int j = 0 ; j < N ; j++ )
            cin >> init[i][j];

    int num = 1;
    for ( int i = 0 ; i < N ; i++ ) {
        for ( int j = 0 ; j < N ; j++ ) {
            if ( init[i][j] == 0 || numbering[i][j] ) continue;

            land[i][j] = num;
            numbering[i][j] = true;
            queue<pair<int, int>> qu;
            qu.push({i,j});

            while ( !qu.empty() ) {
                int x = qu.front().first;
                int y = qu.front().second;
                qu.pop();

                for ( int dir = 0 ; dir < 4 ; dir++ ) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    if ( nx < 0 || nx >= N || ny < 0 || ny >= N ) continue;
                    if ( numbering[nx][ny] || init[nx][ny] == 0 ) continue;

                    land[nx][ny] = num;
                    numbering[nx][ny] = true;
                    qu.push({nx,ny});
                }
            }
            num++;
        }
    }

    int ans = INT_MAX;
    for ( int i = 0 ; i < N ; i++ ) {
        for ( int j = 0 ; j < N ; j++ ) {
            if ( land[i][j] == 0 ) continue;

            memset(visited, false, sizeof(visited));
            queue<pair<int, int>> qu;
            qu.push({i, j});
            visited[i][j] = true;
            int bridge_length = 0;
            bool found = false;

            while ( !qu.empty() && !found ) {
                int size = qu.size();
                for ( int s = 0 ; s < size ; s++ ) {
                    int x = qu.front().first;
                    int y = qu.front().second;
                    qu.pop();

                    for ( int dir = 0 ; dir < 4 ; dir++ ) {
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];

                        if ( nx < 0 || nx >= N || ny < 0 || ny >= N ) continue;
                        if ( visited[nx][ny] ) continue;

                        if ( land[nx][ny] != 0 && land[nx][ny] != land[i][j] ) {
                            ans = min(ans, bridge_length);
                            found = true;
                            break;
                        }

                        if ( land[nx][ny] == 0 ) {
                            visited[nx][ny] = true;
                            qu.push({nx, ny});
                        }
                    }
                }
                bridge_length++;
            }
        }
    }

    cout << ans;
}

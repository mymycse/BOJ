#include <bits/stdc++.h>
using namespace std;

int mp[101][101];
bool b[101][101];
int dx[8] = {-1,-1,0,1,1,1,0,-1};
int dy[8] = {0,1,1,1,0,-1,-1,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int m, n;
    char c;
    cin >> m >> n;

    for ( int i = 0 ; i < m ; i++ )
        for ( int j = 0 ; j < n ; j++ ) {
            cin >> c;
            if ( c == '#' ) mp[i][j] = 1;
        }

    int cnt = 0;
    for ( int i = 0 ; i < m ; i++ ) {
        for ( int j = 0 ; j < n ; j++ ) {
            if ( b[i][j] || mp[i][j] == 0 ) continue;
            
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

                    if ( nx < 0 || nx >= m || ny < 0 || ny >= n ) continue;
                    if ( b[nx][ny] || mp[nx][ny] == 0 ) continue;

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
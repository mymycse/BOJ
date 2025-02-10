#include <bits/stdc++.h>
using namespace std;

int M,N,K;
int grid[101][101];
bool b[101][101];
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> M >> N >> K;

    while ( K-- ) {
        int x1,y1,x2,y2;
        cin >> x1 >> y1 >> x2 >> y2;
        for ( int i = x1 ; i < x2 ; i++ )
            for ( int j = y1 ; j < y2 ; j++ )
                grid[i][j] = 1;
    }

    int cnt = 0;
    vector<int> area;
    for ( int i = 0 ; i < N ; i++ ) {
        for ( int j = 0 ; j < M ; j++ ) {
            if ( grid[i][j] == 1 || b[i][j] ) continue;

            queue<pair<int,int>> qu;
            qu.push({i,j});
            b[i][j] = true;
            cnt++;

            int tempArea = 1;

            while ( !qu.empty() ) {
                auto a = qu.front();
                qu.pop();

                for ( int dir = 0 ; dir < 4 ; dir++ ) {
                    int nx = a.first + dx[dir];
                    int ny = a.second + dy[dir];

                    if ( nx < 0 || nx >= N || ny < 0 || ny >= M ) continue;
                    if ( grid[nx][ny] == 1 || b[nx][ny] ) continue;

                    qu.push({nx,ny});
                    b[nx][ny] = true;
                    tempArea++;
                }
            }

            area.push_back(tempArea);
        }
    }

    sort(area.begin(), area.end());

    cout << cnt << '\n';
    for ( int ans : area )
        cout << ans << ' ';
}
#include <bits/stdc++.h>
using namespace std;

int N;
char pic[101][101];
bool b[101][101];
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};

void bfs( int i, int j ) {
    queue<pair<int,int>> qu;
    qu.push({i,j});
    b[i][j] = true;

    while ( !qu.empty() ) {
        auto a = qu.front();
        qu.pop();

        for ( int dir = 0 ; dir < 4 ; dir++ ) {
            int nx = a.first + dx[dir];
            int ny = a.second + dy[dir];

            if ( nx < 0 || nx >= N || ny < 0 || ny >= N ) continue;
            if ( b[nx][ny] ) continue;
            if ( pic[i][j] != pic[nx][ny] ) continue;

            b[nx][ny] = true;
            qu.push({nx,ny});
        }
    }
}

int area() {
    int cnt = 0;
    for ( int i = 0 ; i < N ; i++ ) 
        for ( int j = 0 ; j < N ; j++ )
            if ( !b[i][j] ) {
                cnt++;
                bfs(i,j);
            }
    
    return cnt;
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    for ( int i = 0 ; i < N ; i++ )
        for ( int j = 0 ; j < N ; j++ )
            cin >> pic[i][j];

    int res1 = area();

    for ( int i = 0 ; i < N  ; i++ )
        for ( int j = 0 ; j < N ; j++ ) {
            b[i][j] = false;
            if ( pic[i][j] == 'G' ) pic[i][j] = 'R';
        }

    int res2 = area();

    cout << res1 << ' ' << res2;
}
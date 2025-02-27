#include <bits/stdc++.h>
using namespace std;

int N, M;
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};
char campus[600][600];
bool b[600][600];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;

    queue<pair<int,int>> qu;
    int pp = 0;

    for ( int i = 0 ; i < N ; i++ )
        for ( int j = 0 ; j < M ; j++ ) {
            cin >> campus[i][j];

            if ( campus[i][j] == 'I' ) {
                qu.push({i,j});
                b[i][j] = true;
            }
        }

    while ( !qu.empty() ) {
        auto a = qu.front();
        qu.pop();

        for ( int dir = 0 ; dir < 4 ; dir++ ) {
            int nx = a.first + dx[dir];
            int ny = a.second + dy[dir];

            if ( nx < 0 || nx >= N || ny < 0 || ny >= M ) continue;
            if ( campus[nx][ny] == 'X' || b[nx][ny] ) continue;
            if ( campus[nx][ny] == 'P' ) pp++;

            qu.push({nx,ny});
            b[nx][ny] = true;
        }
    }

    if ( pp == 0 )
        cout << "TT";
    else
        cout << pp;

    return 0;
}
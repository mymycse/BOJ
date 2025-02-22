#include <bits/stdc++.h>
using namespace std;

int board[5][5];
set <int> numbers;
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};

void bfs(int x, int y, int num, int dep) {
    if ( dep == 6 ) {
        numbers.insert(num);
        return;
    }

    for ( int i = 0 ; i < 4 ; i++ ) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if ( nx >= 0 && nx < 5 && ny >= 0 && ny < 5 )
            bfs(nx,ny,num*10+board[nx][ny], dep+1);
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    for ( int i = 0 ; i < 5 ; i++ )
        for ( int j = 0 ; j < 5 ; j++ )
            cin >> board[i][j];

    for ( int i = 0 ; i < 5 ; i++ )
        for ( int j = 0 ; j < 5 ; j++ )
            bfs(i,j,board[i][j],1);

    cout << numbers.size();

    return 0;
}
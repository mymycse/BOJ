#include <bits/stdc++.h>
using namespace std;

int T, l, sx, sy, fx, fy;
int dx[8] = {1,2,2,1,-1,-2,-2,-1};
int dy[8] = {2,1,-1,-2,2,1,-1,-2};

int bfs(int l, int sx, int sy, int fx, int fy) {
    if ( sx == fx && sy == fy )
        return 0;
    
    vector<vector<bool>> b(l, vector<bool>(l,false));
    queue<pair<int,int>> qu;
    b[sx][sy] = true;
    qu.push({sx,sy});

    int moves = 0;

    while ( !qu.empty() ) {
        int tempSize = qu.size();
        while ( tempSize-- ) {
            int x = qu.front().first;
            int y = qu.front().second;
            qu.pop();

            for ( int dir = 0 ; dir < 8 ; dir++ ) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                
                if ( nx < 0 || nx >= l || ny < 0 || ny >= l || b[nx][ny] ) continue;
                if ( nx == fx && ny == fy ) return moves+1;

                b[nx][ny] = true;
                qu.push({nx,ny});
            }
        }
        moves++;
    }

    return -1;
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> T;

    while ( T-- ) {
        cin >> l >> sx >> sy >> fx >> fy;
        cout << bfs(l,sx,sy,fx,fy) << '\n';        
    }
}
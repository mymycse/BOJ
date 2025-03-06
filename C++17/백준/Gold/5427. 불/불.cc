#include <bits/stdc++.h>
using namespace std;

int w, h;
char tmp;
vector<vector<int>> fire;
vector<vector<bool>> b;
vector<vector<bool>> firespread;
queue <pair<int,int>> fireQu;
queue <pair<int,int>> escapeQu;
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};

int escapeBfs() {
    int sec = 1;
    while ( !escapeQu.empty() ) {
        int tempSize = escapeQu.size();

        while ( tempSize-- ) {
            int x = escapeQu.front().first;
            int y = escapeQu.front().second;
            escapeQu.pop();

            for ( int dir = 0; dir < 4; dir++ ) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if ( nx < 0 || nx >= h || ny < 0 || ny >= w ) return sec;
                if ( ( fire[nx][ny] == 0 && firespread[nx][ny] ) || ( fire[nx][ny] != 0 && fire[nx][ny] <= sec) || b[nx][ny] ) continue;

                escapeQu.push({nx, ny});
                b[nx][ny] = true;
            }
        }
        sec++;
    }

    return -1;
}

int fireBfs() {
    while ( !fireQu.empty() ) {
        int x = fireQu.front().first;
        int y = fireQu.front().second;
        fireQu.pop();

        for ( int dir = 0 ; dir < 4 ; dir++ ) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if ( nx < 0 || nx >= h || ny < 0 || ny >= w ) continue;
            if ( fire[nx][ny] != 0 || firespread[nx][ny] ) continue;

            fireQu.push({nx, ny});
            fire[nx][ny] = fire[x][y] + 1;
            firespread[nx][ny] = true;
        }
    }

    return escapeBfs();
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int tc;
    cin >> tc;

    while ( tc-- ) {
        cin >> w >> h;
        fire = vector<vector<int>>(h, vector<int>(w, 0));
        b = vector<vector<bool>>(h, vector<bool>(w, false));
        firespread = vector<vector<bool>>(h, vector<bool>(w, false));

        while ( !fireQu.empty() ) fireQu.pop();
        while ( !escapeQu.empty() ) escapeQu.pop();
        
        for ( int i = 0 ; i < h ; i++ )
            for ( int j = 0 ; j < w ; j++ ) {
                cin >> tmp;
                if ( tmp == '#' )
                    fire[i][j] = -1;
                else if ( tmp == '*' ) {
                    fireQu.push({i,j});
                    firespread[i][j] = true;
                } else if ( tmp == '@' ) {
                    escapeQu.push({i,j});
                    b[i][j] = true;
                }
            }

        int result = fireBfs();
        if ( result == -1 ) cout << "IMPOSSIBLE\n";
        else cout << result << '\n';
    }
}
#include <bits/stdc++.h>
using namespace std;

int R, C;
int maze[1000][1000];
bool b[1000][1000];
bool visited[1000][1000];
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> R >> C;

    queue <pair<int,int>> fire;
    queue <pair<int, int>> jihoon;

    string temp;
    for ( int i = 0 ; i < R ; i++ ) {
        cin >> temp;
        for ( int j = 0 ; j < C ; j++ ) {
            char c = temp[j];
            if ( c == '#' ) 
                maze[i][j] = -1;
            else if ( c == 'F' ) {
                fire.push({i,j});
                b[i][j] = true;
                maze[i][j] = 0;
            }
            else if ( c == 'J' ) {
                jihoon.push({i,j});
                visited[i][j] = true;
            }
        }
    }

    int minute = 1;
    while ( !fire.empty() ) {
        int tempSize = fire.size();
        while ( tempSize-- ) {
            auto cur = fire.front();
            fire.pop();

            for ( int dir = 0 ; dir < 4 ; dir++ ) {
                int nx = cur.first + dx[dir];
                int ny = cur.second + dy[dir];

                if ( nx < 0 || nx >= R || ny < 0 || ny >= C ) continue;
                if ( maze[nx][ny] == -1 || b[nx][ny] ) continue;

                if ( maze[nx][ny] == 0 ) maze[nx][ny] = minute;
                else maze[nx][ny] = min(maze[nx][ny], minute);

                fire.push({nx,ny});
                b[nx][ny] = true;
            }
        }

        minute++;
    }

    minute = 1;
    while ( !jihoon.empty() ) {
        int tempSize = jihoon.size();
        while ( tempSize-- ) {
            auto cur = jihoon.front();
            jihoon.pop();

            for ( int dir = 0 ; dir < 4 ; dir++ ) {
                int nx = cur.first + dx[dir];
                int ny = cur.second + dy[dir];

                if ( nx < 0 || nx >= R || ny < 0 || ny >= C ) {
                    cout << minute;
                    return 0;
                }

                if ( maze[nx][ny] < 0 || visited[nx][ny] ) continue;
                if ( maze[nx][ny] <= minute && b[nx][ny] ) continue;

                visited[nx][ny] = true;
                jihoon.push({nx,ny});
            }
        }

        minute++;
    }

    cout << "IMPOSSIBLE";
    return 0;
}
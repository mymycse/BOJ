#include <bits/stdc++.h>
using namespace std;

int R, C, cnt = 1, answer = 0;
char arr[20][20];
bool b[26];

int dx[] = {1,0,-1,0};
int dy[] = {0,1,0,-1};

void dfs(int i, int j) {
    if ( i < 0 || i >= R || j < 0 || j >= C ) return;
    if ( b[arr[i][j]-'A'] ) return;
    if ( cnt > answer ) answer = cnt;

    b[arr[i][j]-'A'] = true;
    cnt++;
    for ( int dir = 0 ; dir < 4 ; dir++ ) dfs(i+dx[dir], j+dy[dir]);
    cnt--;
    b[arr[i][j]-'A'] = false;
}

int main() {
    ios::sync_with_stdio(0), cin.tie(0);

    cin >> R >> C;
    string temp;

    for ( int i = 0 ; i < R ; i++ ) {
        cin >> temp;
        for ( int j = 0 ; j < C ; j++ )
            arr[i][j] = temp[j];
    }

    dfs(0,0);
    cout << answer;
    return 0;
}
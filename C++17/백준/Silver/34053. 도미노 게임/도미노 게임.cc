#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int N, M;
    cin >> N >> M;
    
    int score[N][M];
    int min = 1000000001;
    long long sum = 0;
    for ( int i = 0 ; i < N ; i++ )
        for ( int j = 0 ; j < M ; j++ ) {
            cin >> score[i][j];
            sum += score[i][j];
            if ( score[i][j] < min ) min = score[i][j];
        }
    cout << (sum-min);
    return 0;
}
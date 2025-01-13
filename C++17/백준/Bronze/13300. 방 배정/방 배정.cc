#include <bits/stdc++.h>
using namespace std;

int students[2][7];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, K;
    cin >> N >> K;

    for ( int i = 0 ; i < N ; i++ ) {
        int S, Y;
        cin >> S >> Y;
        students[S][Y]++;
    }

    int rooms = 0;

    for ( int i = 0 ; i < 2 ; i++ ) 
        for ( int j = 1 ; j <= 6 ; j++ ) {
            rooms += students[i][j]/K;
            if ( students[i][j]%K > 0 ) rooms++;
        }

    cout << rooms;
}
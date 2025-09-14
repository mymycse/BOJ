#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int N, r, cnt = 0, score = 0;
    cin >> N;
    
    while ( N-- ) {
        cin >> r;
        if ( r == 1 ) score += (r+cnt++);
        else cnt = 0;
    }
    
    cout << score;
    return 0;
}
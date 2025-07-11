#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    char res[4] = {'N','E','S','W'};
    int idx = 0;
    int t;
    
    for ( int i = 0 ; i < 10 ; i++ ) {
        cin >> t;
        if ( t == 1 ) {
            idx = (idx+1)%4;
        }
        else if ( t == 2 ) {
            idx = (idx+2)%4;
        }
        else if ( t == 3 ) {
            idx = (idx+3)%4;
        }
    }
    
    cout << res[idx];
    return 0;
}
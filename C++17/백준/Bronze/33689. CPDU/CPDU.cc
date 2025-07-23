#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    string s;
    cin >> n;
    
    int cnt = 0;
    for ( int i = 0 ; i < n ; i++ ) {
        cin >> s;
        if ( s[0] == 'C' ) cnt++;
    }
    
    cout << cnt;
    return 0;
}
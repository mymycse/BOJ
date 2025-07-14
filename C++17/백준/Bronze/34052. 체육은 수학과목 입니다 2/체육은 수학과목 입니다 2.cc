#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int t, sec = 1800;
    
    for ( int i = 0 ; i < 4 ; i++ ) {
        cin >> t;
        sec -= t;
    }
    
    if ( sec >= 300 ) cout << "Yes";
    else cout << "No";
    
    return 0;
}
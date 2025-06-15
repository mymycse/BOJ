#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    cin >> n;
    
    for ( int i = 1 ; i <= n ; i++ ) {
        int res = 0, temp;
        for ( int i = 0 ; i < 5 ; i++ ) {
            cin >> temp;
            if ( temp > res ) res = temp;
        }
        cout << "Case #" << i << ": " << res << "\n";
    }
    return 0;
}
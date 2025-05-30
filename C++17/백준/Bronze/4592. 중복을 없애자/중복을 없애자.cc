#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n, temp;
    
    while ( true ) {
        cin >> n;
        if ( n == 0 ) return 0;
        
        int prev = -1;
        for ( int i = 0 ; i < n ; i++ ) {
            cin >> temp;
            if ( temp != prev ) cout << temp << ' ';
            prev = temp;
        }
        cout << "$\n";
    }
}
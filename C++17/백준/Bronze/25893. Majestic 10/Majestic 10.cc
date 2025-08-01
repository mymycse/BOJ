#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int t, num;
    int arr[3];
    cin >> t;
    
    while ( t-- ) {
        int cnt = 0;
        for ( int i = 0 ; i < 3 ; i++ ) {
            cin >> num;
            if ( num >= 10 ) cnt++;
            cout << num << ' ';
        }
        
        if ( cnt == 0 ) cout << "\nzilch";
        else if ( cnt == 1 ) cout << "\ndouble";
        else if ( cnt == 2 ) cout << "\ndouble-double";
        else if ( cnt == 3 ) cout << "\ntriple-double";
        
        if ( t != 0 ) cout << "\n\n";
    }
    
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int t, n, d;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> t;

    for ( int i = 1 ; i <= t ; i++ ) {
        cin >> n >> d;
        cout << "Case "<< i << ": ";

        if ( n/d != 0 )
            cout << (n/d) << " ";
        if ( n%d != 0 )
            cout << (n%d) << "/" << d;

        if ( n/d == 0 && n%d == 0 )
            cout << 0;
            
        cout << '\n';
    }

    return 0;
}
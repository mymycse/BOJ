#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int T, d, n, s, p;
    cin >> T;
    
    while ( T-- ) {
        cin >> d >> n >> s >> p;
        int n1 = d + n*p;
        int n2 = n*s;
        
        if ( n1 < n2 ) cout << "parallelize";
        else if ( n1 == n2 ) cout << "does not matter";
        else cout << "do not parallelize";
        cout << '\n';
    }
}
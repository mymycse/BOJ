#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    while ( true ) {
        cin >> n;
        if ( n == 0 ) return 0;
        int res = n*(n+1)*(2*n+1)/6;
        cout << res << '\n';
    }
}
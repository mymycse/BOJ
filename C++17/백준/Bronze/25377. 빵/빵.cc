#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n, a, b;
    cin >> n;
    
    int res = 1001;
    while ( n-- ) {
        cin >> a >> b;
        if ( a <= b ) res = min(res, b);
    }
    
    if ( res == 1001 ) res = -1;
    cout << res;
    return 0;
}
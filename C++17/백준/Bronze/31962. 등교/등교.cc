#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n, x, a, b;
    cin >> n >> x;
    
    int res = -1;
    while ( n-- ) {
        cin >> a >> b;
        if ( a+b <= x ) {
            if ( res < a ) res = a;
        }
    }
    
    cout << res;
    return 0;
}
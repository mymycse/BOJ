#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int a, b;
    cin >> a >> b;
    
    int d = 4*a*a-4*b;
    if ( d == 0 ) cout << -a;
    else {
        int sq = sqrt(d);
        int x1 = -a-sq/2;
        int x2 = -a+sq/2;
        cout << x1 << ' ' << x2;
    }
    
    return 0;
}
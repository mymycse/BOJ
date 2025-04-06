#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int a, b, c, d, e, i;
    for ( i = 0 ; i < 2 ; i++ ) {
        cin >> a >> b >> c >> d >> e;
        int sum = a*6 + b*3 + c*2 + d + e*2;
        cout << sum << ' ';
    }
    
}
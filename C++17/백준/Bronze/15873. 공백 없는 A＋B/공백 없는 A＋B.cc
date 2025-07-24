#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int n;
    cin >> n;
    
    if ( n > 100 ) {
        if ( n%10 == 0 ) cout << (n/100 + 10);
        else cout << (n%10 + 10);
    }
    else {
        cout << (n/10 + n%10);
    }
    
    return 0;
}
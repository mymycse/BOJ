#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    cin >> n;
    
    if ( n >= 4 && n <= 6 ) cout << 3;
    else if ( n >= 2 && n <= 8 ) cout << 2;
    else cout << 1;
    
    return 0;
}
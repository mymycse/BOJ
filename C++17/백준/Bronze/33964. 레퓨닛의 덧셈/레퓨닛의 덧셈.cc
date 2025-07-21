#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int X, Y;
    cin >> X >> Y;
    
    int mx = max(X,Y);
    int mn = min(X,Y);
    
    for ( int i = 0 ; i < (mx-mn) ; i++ ) cout << '1';
    for ( int i = 0 ; i < mn ; i++ ) cout << '2';
    
    return 0;
}
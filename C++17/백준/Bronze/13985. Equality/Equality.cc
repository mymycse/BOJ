#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int a, b, c;
    char op;
    cin >> a >> op >> b;
    cin >> op >> c;
    
    if ( (a+b) == c ) cout << "YES\n";
    else cout << "NO\n";
    
    return 0;
}
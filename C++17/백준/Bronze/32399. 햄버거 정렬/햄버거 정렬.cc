#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    string s;
    cin >> s;
    
    if ( s == "(1)" ) cout << 0;
    else if ( s == ")(1" || s == "1)(" || s == "()1" || s == "1()" ) cout << 1;
    else cout << 2;
    return 0;
}
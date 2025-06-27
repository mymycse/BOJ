#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int a, w, v;
    cin >> a >> w >> v;
    
    if ( a <= w/v ) cout << 1;
    else cout << 0;
    
    return 0;
}
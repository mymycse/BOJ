#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int n, m;
    cin >> n >> m;
    
    if ( (double)n/m >= 0.5 ) cout << 'E';
    else cout << 'H';
    
    return 0;
}
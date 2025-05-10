#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int n;
    long res;
    
    cin >> n;
    
    if ( n < 4 ) res = 0;
    else res = (n-1)*(n-2)*(n-3)/6;
    
    cout << res;
    return 0;
}
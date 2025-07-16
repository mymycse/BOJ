#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    long long res = 1;
    int a, b, n;
    cin >> a >> b;
    
    for ( int i = a; i <= b; i++ ) {
        n = i*(i+1)/2;
        res *= n;
        res %= 14579;
    }
    
    cout << res;
    return 0;
}
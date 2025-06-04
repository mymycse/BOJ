#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n, m, res = 0;
    cin >> n >> m;
    
    while ( n != m ) {
        n = (n+1)%24;
        res++;
    }
    
    cout << res;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n, temp, res = 0;
    
    cin >> n;
    
    while ( n-- ) {
        cin >> temp;
        res += temp;
    }
    
    cout << res;
    return 0;
}
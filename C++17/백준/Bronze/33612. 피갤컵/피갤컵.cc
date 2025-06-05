#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    cin >> n;
    
    int m = 8 + (n-1)*7;
    int y = 2024;

    while ( m > 12 ) {
        m -= 12;
        y++;
    }
    
    cout << y << ' ' << m;
    return 0;
}
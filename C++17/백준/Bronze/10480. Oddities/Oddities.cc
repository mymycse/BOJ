#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    cin >> n;
    
    while ( n-- ) {
        int num;
        cin >> num;
        cout << num;
        if ( num %2 == 0 ) cout << " is even\n";
        else cout << " is odd\n";
    }
    return 0;
}
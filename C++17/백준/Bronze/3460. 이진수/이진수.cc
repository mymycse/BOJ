#include <bits/stdc++.h>
using namespace std;

int main() {
    int T, n;
    cin >> T;

    while ( T-- ) {
        cin >> n;
        int dgt = 0;
        while ( n > 0 ) {
            if ( n%2 == 1 ) cout << dgt << ' ';
            n /= 2;
            dgt++;
        }
        cout << "\n";
    }

    return 0;
}
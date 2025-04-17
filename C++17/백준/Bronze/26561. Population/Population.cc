#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, p, t;
    cin >> n;

    while ( n-- ) {
        cin >> p >> t;
        p += t/4;
        p -= t/7;
        cout << p << '\n';
    }
}
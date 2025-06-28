#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int N, x, y, tx, ty;
    cin >> N >> x >> y;

    for ( int i = 1 ; i < N ; i++ ) {
        cin >> tx >> ty;

        if ( ty < y ) {
            y = ty;
            x = tx;
        }
    }

    cout << x << ' ' << y;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;
using ld = long double;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int x1, y1, x2, y2, x3, y3, res;
    cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;

    int s = (x1*y2 + x2*y3 + x3*y1) - (x2*y1 + x3*y2 + x1*y3);

    if ( s < 0  ) res = -1;
    else if ( s > 0  ) res = 1;
    else res = 0;

    cout << res;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int S, T, D;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> S >> T >> D;

    int res = D*T/(S*2);
    cout << res;

    return 0;
}
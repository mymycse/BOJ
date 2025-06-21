#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n, h;
    long long res = 0;
    cin >> n >> h;

    res += pow(h,2);
    for ( int i = 1 ; i < n-1 ; i++ ) {
        cin >> h;
        res += 2*pow(h,2);
    }
    cin >> h;
    res += pow(h,2);
    res *= 2;

    cout << res;
    return 0;
}
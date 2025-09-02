#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);

    int N; 
    cin >> N;

    long long ans = 0;
    while (N--) {
        long long a, d, g;
        cin >> a >> d >> g;
        long long s = a * (d+g);
        if (a == d+g) s *= 2;
        ans = max(ans, s);
    }

    cout << ans;
    return 0;
}

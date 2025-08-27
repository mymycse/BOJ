#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    long long N, S;
    while (cin >> N >> S) {
        cout << (S/(N+1)) << '\n';
    }
    return 0;
}
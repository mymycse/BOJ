#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    string S;
    cin >> N >> S;

    int cnt = 0;
    for (int i = 0; i < N/2; i++) {
        if (S[i] != S[N-1-i]) cnt++;
    }
    cout << cnt << '\n';
    return 0;
}
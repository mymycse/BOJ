#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    string s;
    cin >> N >> s;

    for (int K = 1 ; K <= N ; K++) {
        unordered_set<string> seen;
        bool ok = true;
        for (int i = 0; i + K <= N; i++) {
            string t = s.substr(i, K);
            if (seen.count(t)) {
                ok = false;
                break;
            }
            seen.insert(t);
        }
        if (ok) {
            cout << K;
            return 0;
        }
    }
    return 0;
}

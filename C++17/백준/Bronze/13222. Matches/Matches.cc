#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, W, H, match;
    cin >> N >> W >> H;

    double maxLength = sqrt(W * W + H * H);

    for ( int i = 0 ; i < N ; i++ ) {
        cin >> match;
        if (match <= maxLength) cout << "YES\n";
        else cout << "NO\n";
    }

    return 0;
}

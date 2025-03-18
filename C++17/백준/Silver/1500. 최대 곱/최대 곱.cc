#include <bits/stdc++.h>
using namespace std;

int S, K;
long long res = 1;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> S >> K;
    int temp = S/K;
    int mod = S%K;

    for ( int i = 0 ; i < K ; i++ ) {
        if ( mod > 0 ) {
            res *= temp+1;
            mod--;
        } else res *= temp;
    }

    cout << res;
    return 0;
}
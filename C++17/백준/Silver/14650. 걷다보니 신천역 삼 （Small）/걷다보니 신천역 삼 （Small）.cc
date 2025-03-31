#include <bits/stdc++.h>
using namespace std;

int N;
int res = 0;

void func( int n, int sum ) {
    for ( int i = 0 ; i < 3 ; i++ ) {
        if ( n == 0 && i == 0 ) continue;
        if ( n == N ) {
            if ( sum%3 == 0 ) {
                res += 1;
                return;
            }
        } else {
            func(n+1, sum*10 + i);
        }
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    func(0, 0);
    cout << res << '\n';

    return 0;
}

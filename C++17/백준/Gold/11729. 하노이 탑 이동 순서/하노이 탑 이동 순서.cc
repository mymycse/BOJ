#include <bits/stdc++.h>
using namespace std;

int N;

void rec(int n, int s, int e) {
    if ( n == 1 ) {
        cout << s << ' ' << e << '\n';
        return;
    }

    rec(n-1, s, 6-s-e);
    cout << s << ' ' << e << '\n';
    rec(n-1, 6-s-e, e);
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    cout << (1<<N)-1 << '\n';
    rec(N,1,3);
    
    return 0;
}
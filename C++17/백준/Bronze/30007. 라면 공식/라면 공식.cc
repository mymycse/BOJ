#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int N, A, B, X;
    cin >> N;
    
    while ( N-- ) {
        cin >> A >> B >> X;
        cout << A*(X-1)+B << '\n';
    }
    
    return 0;
}
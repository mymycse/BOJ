#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int N, A, B;
    cin >> N >> A >> B;
    
    if ( B-N < 0 || A < B ) cout << "Bus";
    else if ( B == A ) cout << "Anything";
    else cout << "Subway";
}
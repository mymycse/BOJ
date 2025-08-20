#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int T, N, sum=0, f;
    cin >> T >> N;
    
    while ( N-- ) {
        cin >> f;
        sum += f;
    }
    
    if ( T > sum ) cout << "Padaeng_i Cry";
    else cout << "Padaeng_i Happy";
    
    return 0;
}
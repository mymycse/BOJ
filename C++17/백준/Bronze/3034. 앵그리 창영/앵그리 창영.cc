#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int N, W, H, len;
    cin >> N >> W >> H;
    
    double mx = sqrt(W*W+H*H);
    while ( N-- ) {
        cin >> len;
        if ( len <= mx ) cout << "DA\n";
        else cout << "NE\n";
    }
    
    return 0;
}
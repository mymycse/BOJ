#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int K, N, t;
    char ch;
    cin >> K >> N;

    int cur = K;
    int clk = 210;
    
    while ( N-- ) {
        cin >> t >> ch;
        clk -= t;

        if ( clk <= 0 ) {
            cout << cur;
            return 0;
        }
        
        if ( ch == 'T' ) cur = (cur%8)+1;
    }
}
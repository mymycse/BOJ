#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int N, temp;
    int m = 1000;
    int M = 0;
    cin >> N;
    
    while ( N-- ) {
        cin >> temp;
        m = fmin(m, temp);
        M = fmax(M, temp);
    }
    
    cout << M-m;
}
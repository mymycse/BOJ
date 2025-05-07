#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int res = 0;
    int temp;
    for ( int i = 0 ; i < 6 ; i++ ) {
        cin >> temp;
        res += temp;
    }
    
    res *= 5;
    cout << res;
    return 0;
}
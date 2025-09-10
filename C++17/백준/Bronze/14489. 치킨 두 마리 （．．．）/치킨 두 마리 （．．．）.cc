#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int A, B, C;
    cin >> A >> B >> C;
    
    if ( A+B >= C*2 ) cout << (A+B-C*2);
    else cout << (A+B);
    
    return 0;
}
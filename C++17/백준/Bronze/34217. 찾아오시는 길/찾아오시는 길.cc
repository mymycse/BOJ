#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int A, B, C, D;
    cin >> A >> B;
    cin >> C >> D;
    
    if ( (A+C) > (B+D) ) cout << "Yongdap";
    else if ( (A+C) < (B+D) ) cout << "Hanyang Univ.";
    else cout << "Either";
    
    return 0;
}
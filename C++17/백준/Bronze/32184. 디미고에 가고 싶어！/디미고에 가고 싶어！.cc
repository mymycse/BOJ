#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int A, B;
    cin >> A >> B;
    
    int cnt = 0;
    if ( A%2 == 0 ) {
        cnt++;
        A++;
    }
    
    if ( B%2 == 1 ) {
        cnt++;
        B--;
    }
    
    cnt += (B-A+1)/2;
    
    cout << cnt;
    return 0;
}
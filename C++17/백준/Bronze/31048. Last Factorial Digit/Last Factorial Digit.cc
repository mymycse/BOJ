#include <bits/stdc++.h>
using namespace std;

int main(void) {
    int N, t;
    cin >> N;
    
    while ( N-- ) {
        cin >> t;
        int num = 1;
        for ( int i = t ; i >= 1 ; i-- ) {
            num *= i;
            num %= 10;
        }
        
        cout << num << '\n';
    }
}
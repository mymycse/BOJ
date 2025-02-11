#include <bits/stdc++.h>
using namespace std;

int N;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    if ( 1 <= N && N <= 9 ) {
        cout << 1;
        return 0;
    } 

    for ( int i = 1 ; i <= 9 ; i++ ) {
        if ( N%i == 0 && N/i >= 2 && N/i <= 9 ) {
            cout << 1;
            return 0;
        }
    }

    cout << 0;
    return 0;
}
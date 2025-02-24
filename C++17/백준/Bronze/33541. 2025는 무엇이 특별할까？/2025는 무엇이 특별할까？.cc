#include <bits/stdc++.h>
using namespace std;

int X;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> X;

    while ( true ) {
        X++;
        
        if ( X > 9999 )
            break;

        int temp = (int) pow((X/100) + (X%100), 2);
        
        if ( X == temp ) {
            cout << X;
            return 0;
        }
    }

    cout << -1;
    return 0;
}
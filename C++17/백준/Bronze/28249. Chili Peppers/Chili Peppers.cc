#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int T;
    string pp;
    long long scv = 0;
    
    cin >> T;
    while ( T-- ) {
        cin >> pp;
        if ( pp[0] == 'P' ) scv += 1500;
        else if ( pp[0] == 'M' ) scv += 6000;
        else if ( pp[0] == 'S' ) scv += 15500;
        else if ( pp[0] == 'C' ) scv += 40000;
        else if ( pp[0] == 'T' ) scv += 75000;
        else if ( pp[0] == 'H' ) scv += 125000;
    }
    
    cout << scv;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    string str;
    
    cin >> n >> str;
    
    if ( str[n-1] == 'G' ) {
        for ( int i = 0 ; i < n-1 ; i++ ) cout << str[i];
    }
    else {
        cout << str << 'G';
    }
    
    return 0;
}
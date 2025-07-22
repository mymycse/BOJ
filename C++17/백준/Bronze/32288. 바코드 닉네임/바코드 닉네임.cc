#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    string str;
    
    cin >> n >> str;
    for ( int i = 0 ; i < n ; i++ ) {
        if ( str[i] == 'I' ) cout << 'i';
        else cout << 'L';
    }
    
    return 0;
}
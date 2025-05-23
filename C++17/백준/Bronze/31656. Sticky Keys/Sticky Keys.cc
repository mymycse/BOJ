#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    string str;
    getline(cin, str);
    
    int len = str.length();
    char prev = str[0];
    cout << prev;
    for ( int i = 1 ; i < len ; i++ ) {
        if ( prev != str[i] ) {
            cout << str[i];
            prev = str[i];
        }
    }
    
    return 0;
}
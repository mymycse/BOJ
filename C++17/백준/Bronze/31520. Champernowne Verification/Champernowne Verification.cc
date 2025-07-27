#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    string str;
    cin >> str;
    
    int len = str.length();
    char st = '1';
    
    for ( int i = 0 ; i < len ; i++ ) {
        if ( str[i] != st+i ) {
            cout << "-1";
            return 0;
        }
    }
    
    cout << len;
    return 0;
}
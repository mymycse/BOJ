#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int N;
    string str;
    cin >> N;
    
    while ( N-- ) {
        cin >> str;
        int len = str.length();
        string res = "";
        res += str[0];
        
        for ( int i = 1 ; i < len ; i++ ) {
            if ( res[res.length()-1] == str[i] ) continue;
            res += str[i];
        }
        
        cout << res << '\n';
    }
}
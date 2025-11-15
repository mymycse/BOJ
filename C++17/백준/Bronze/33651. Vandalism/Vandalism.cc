#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    string str = "UAPC";
    string s;
    cin >> s;
    
    for(int i = 0; i < 4; i++) {
        bool isExist = false;
        for(int j = 0; j < s.length(); j++) {
            if ( str[i] == s[j] ) {
                isExist = true;
                break;
            }
        }
        if ( !isExist ) cout << str[i];
    }
    
    return 0;
}
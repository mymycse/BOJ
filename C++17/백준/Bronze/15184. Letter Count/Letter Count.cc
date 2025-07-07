#include <bits/stdc++.h>
using namespace std;
int cnt[26];

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    string str;
    getline(cin, str);
    
    int len = str.length();
    for ( int i = 0 ; i < len ; i++ ) {
        if ( 'a' <= str[i] && str[i] <= 'z' ) 
            cnt[str[i]-'a']++;
        else if ( 'A' <= str[i] && str[i] <= 'Z' ) 
            cnt[str[i]-'A']++;
    }
    
    for ( int i = 0 ; i < 26 ; i++ ) {
        char ch = 'A'+i;
        cout << ch << " | ";
        for ( int j = 0 ; j < cnt[i] ; j++ )
            cout << '*';
        cout << '\n';
    }
    
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int T, idx;
    int a[26];
    string str;
    cin >> T;
    cin.ignore();
    
    while ( T-- ) {
        getline(cin, str);
        int len = str.length();
        int max = 0, cnt = 0;
        char res;
        fill(a, a+26, 0);
        
        for ( int i = 0 ; i < len ; i++ ) {
            if ( str[i] == ' ' ) continue;
            
            idx = str[i]-'a';
            a[idx]++;
            
            if ( a[idx] > max ) {
                cnt = 1;
                max = a[idx];
                res = str[i];
            } else if ( a[idx] == max ) {
                cnt++;
            }
        }
        
        if ( cnt == 1 ) cout << res << '\n';
        else if ( cnt > 1 ) cout << "?\n";
    }
    
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int t, len1, len2;
    int a[26];
    string str1, str2;
    cin >> t;
    
    while ( t-- ) {
        cin >> str1 >> str2;
        fill_n(a,26,0);
        
        len1 = str1.length();
        len2 = str2.length();
        bool res = true;
        
        if ( len1 == len2 ) {
            for ( int i = 0 ; i < len1 ; i++ )
                a[str1[i]-'a']++;
            
            for ( int i = 0 ; i < len2 ; i++ )
                a[str2[i]-'a']--;
            
            for ( int i = 0 ; i < 26 ; i++ )
                if ( a[i] != 0 ) {
                    res = false;
                    break;
                }
        }
        else res = false;
        
        cout << str1 << " & " << str2 << " are ";
        if ( !res ) cout << "NOT ";
        cout << "anagrams.\n";
    }
}
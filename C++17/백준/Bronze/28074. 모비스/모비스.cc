#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    string str;
    cin >> str;
    
    int len = str.length();
    string MOBIS = "MOBIS";
    int a[26] = {0};
    
    for ( int i = 0 ; i < len ; i++ )
        a[str[i]-'A']++;
    
    for ( int i = 0 ; i < 5 ; i++ ) {
        if ( a[MOBIS[i]-'A'] == 0 ) {
            cout << "NO";
            return 0;
        }
    }
    
    cout << "YES";
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int N;

bool strfry(string s1, string s2) {
    int a[26] = {};

    for ( auto ch : s1 ) a[ch-'a']++;
    for ( auto ch : s2 ) a[ch-'a']--;

    for ( int cnt : a )
        if ( cnt != 0 )
            return false;

    return true;
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    while ( N-- > 0 ) {
        string str1, str2;
        cin >> str1 >> str2;

        if ( strfry(str1,str2) ) cout << "Possible\n";
        else cout << "Impossible\n" ;
    }
}
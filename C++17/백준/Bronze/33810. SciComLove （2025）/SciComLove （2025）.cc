#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    string s;
    cin >> s;
    
    string crt = "SciComLove";
    int cnt = 0;
    
    for ( int i = 0 ; i < 10 ; i++ )
        if ( crt[i] != s[i] ) cnt++;
    
    cout << cnt;
    return 0;
}
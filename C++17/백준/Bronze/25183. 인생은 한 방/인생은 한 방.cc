#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int n;
    string str;
    
    cin >> n;
    cin >> str;
    int cnt = 1;
    char now, prev;
    prev = str[0];
    
    for ( int i = 1 ; i < n ; i++ ) {
        now = str[i];
        if ( abs(now-prev) == 1 ) cnt++;
        else cnt = 1;
        
        if ( cnt == 5 ) break;
        prev = now;
    }
    
    if ( cnt >= 5 ) cout << "YES";
    else cout << "NO";
}
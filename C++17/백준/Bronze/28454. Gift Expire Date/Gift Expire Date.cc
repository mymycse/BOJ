#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    string cur, date;
    cin >> cur;
    
    int t;
    cin >> t;
    
    int cnt = 0;
    while ( t-- ) {
        cin >> date;
        if ( date >= cur ) cnt++;
    }
    
    cout << cnt;
    return 0;
}
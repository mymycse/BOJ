#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    string s;
    cin >> s;
    
    int len = s.length();
    if ( len < 5 ) {
        cout << "not cute";
        return 0;
    }
    
    string subst = s.substr(len-5, 5);
    
    if ( subst == "driip" ) cout << "cute";
    else cout << "not cute";
}
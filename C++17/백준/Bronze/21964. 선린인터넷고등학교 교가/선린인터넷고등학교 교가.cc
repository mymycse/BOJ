#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    string str;
    
    cin >> n;
    cin >> str;
    
    for ( int i = n-5 ; i < n ; i++ )
        cout << str[i];
    
    return 0;
}
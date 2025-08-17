#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int N;
    cin >> N;
    
    string name;
    while ( N-- ) {
        cin >> name;
        int len = name.length();
        if ( len > 10 ) continue;
        
        int l = 0, L = 0, letter = 0;
        for ( int i = 0 ; i < len ; i++ ) {
            if ( name[i] >= 'a' && name[i] <= 'z' ) l++;
            else if ( name[i] >= 'A' && name[i] <= 'Z' ) L++;
            if ( name[i] < '0' || name[i] > '9' ) letter++;
        }
        if ( L > l ) continue;
        if ( letter == 0 ) continue;
        
        cout << name;
        return 0;
    }
}
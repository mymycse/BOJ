#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int T;
    cin >> T;

    while ( T-- ) {
        list<char> l;
        auto cursor = l.end();
        string input;

        cin >> input;
        for ( int i = 0 ; i < input.length() ; i++ ) {
            char c = input[i];

            if ( c == '-' ) {
                if ( cursor != l.begin() ) l.erase(prev(cursor));
            } 
            else if ( c == '<' ) {
                if ( cursor != l.begin() ) cursor--;
            }
            else if ( c == '>' ) {
                if ( cursor != l.end() ) cursor++;
            }
            else {
                l.insert(cursor, c);
            }
        }

        for ( auto c : l ) cout << c;
        cout << '\n';
    }
}
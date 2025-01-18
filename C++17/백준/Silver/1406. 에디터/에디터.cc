#include <bits/stdc++.h>
using namespace std;

list<char> str;
string st;
int T;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> st >> T;

    for ( auto c : st ) str.push_back(c);
    auto cursor = str.end();

    while ( T-- > 0 ) {
        string cmd;
        cin >> cmd;

        if ( cmd == "L" && cursor != str.begin() ) {
            cursor--;
        } 
        else if ( cmd == "D" && cursor != str.end() ) {
            cursor++;
        } 
        else if ( cmd == "B" && cursor != str.begin() ) {
            str.erase(prev(cursor));
        }
        else if ( cmd == "P" ) {
            char s;
            cin >> s;
            
            str.insert(cursor, s);
        }
    }

    for ( auto c : str ) cout << c;
}
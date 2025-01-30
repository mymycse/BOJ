#include <bits/stdc++.h>
using namespace std;

int N;
string temp;
set <string> ig;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    for ( int i = 0 ; i < N ; i++ ) {
        cin >> temp;
        ig.insert(temp);
    }

    for ( int i = 1 ; i < N ; i++ ) {
        cin >> temp;
        ig.erase(temp);
    }

    for ( auto a : ig )
        cout << a;
}
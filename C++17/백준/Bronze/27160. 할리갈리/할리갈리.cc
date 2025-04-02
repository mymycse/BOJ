#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, num;
    string S;
    map<string, int> fruits;

    cin >> N;

    while ( N-- ) {
        cin >> S >> num;
        fruits[S] += num;
    }

    for ( auto iter = fruits.begin() ; iter != fruits.end() ; iter++ ) {
        if ( iter->second == 5 ) {
            cout << "YES";
            return 0;
        }
    }

    cout << "NO";
    return 0;
}
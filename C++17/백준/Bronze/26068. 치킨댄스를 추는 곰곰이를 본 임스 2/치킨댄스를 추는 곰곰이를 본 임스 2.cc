#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, x;
    string s;
    int cnt = 0;
    cin >> N;

    while ( N-- ) {
        cin >> s;
        x = stoi(s.substr(2));
        if ( x <= 90 ) cnt++;
    }

    cout << cnt;
}
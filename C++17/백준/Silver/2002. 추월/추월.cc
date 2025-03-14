#include <bits/stdc++.h>
using namespace std;

int N, i;
string c;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    int result = 0;
    unordered_map<string, int> car;
    vector<string> s(N);

    for ( i = 0 ; i < N ; i++ ) {
        cin >> c;
        car[c] = i;
    }

    for ( i = 0 ; i < N ; i++ )
        cin >> s[i];

    for ( int i = 0 ; i < N ; i++ )
        for ( int j = i+1 ; j < N ; j++ )
            if ( car[s[i]] > car[s[j]] ) {
                result++;
                break;
            }

    cout << result << '\n';
    return 0;
}
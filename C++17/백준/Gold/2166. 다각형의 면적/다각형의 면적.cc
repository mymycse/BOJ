#include <bits/stdc++.h>
using namespace std;
using ld = long double;
int N;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    vector<pair<ld,ld>> tri(N+1);
    for ( int i = 0 ; i < N ; i++ )
        cin >> tri[i].first >> tri[i].second;

    tri[N].first = tri[0].first;
    tri[N].second = tri[0].second;

    ld result = 0;

    for ( int i = 0 ; i < N ; i++ )
        result += tri[i].first * tri[i+1].second - tri[i+1].first * tri[i].second;
    
    result = abs(result)/2.0;

    cout << fixed;
    cout.precision(1);
    cout << result;
    return 0;
}
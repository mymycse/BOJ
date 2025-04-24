#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int n, m, T, usage;
    cin >> n >> m >> T;
    
    while ( T-- ) {
        cin >> usage;
        int cost = fmin(1000,usage)*n;
        if ( usage > 1000 ) cost += (usage-1000)*m;
        cout << usage << ' ' << cost << '\n';
    }
}
#include <bits/stdc++.h>
using namespace std;

int k;
int S[13];
bool isused[13];
int res[7];

void lotto(int d, int st) {
    if ( d == 6 ) {
        for ( int i = 0 ; i < 6 ; i++ )
            cout << res[i] << ' ';
        cout << '\n';
        return;
    }

    for ( int i = st ; i < k ; i++ ) {
        if ( !isused[i] ) {
            isused[i] = true;
            res[d] = S[i];
            lotto(d+1,i+1);
            isused[i] = false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    while ( true ) {
        cin >> k;

        if ( k == 0 ) return 0;

        for ( int i = 0 ; i < k ; i++ ) 
            cin >> S[i];

        lotto(0,0);
        cout << '\n';
    }
    return 0;
}
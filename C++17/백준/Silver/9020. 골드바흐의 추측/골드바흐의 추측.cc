#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    vector<bool> prime(10001, true);
    prime[0] = prime[1] = false;

    for ( int i = 2 ; i*i <= 10000 ; i++ ) {
        if ( !prime[i] ) continue;
        
        for ( int j = 2 ; j*i <= 10000 ; j++ )
            prime[i*j] = false;
    }

    vector<int> prme;
    for ( int i = 2 ; i <= 10000 ; i++ )
        if ( prime[i] )
            prme.push_back(i);

    int size = prme.size();
    int T, n;
    cin >> T;

    while ( T-- ) {
        cin >> n;

        int st = 0;
        int en = size-1;
        int r, l;

        while ( st <= en ) {
            int temp = prme[st] + prme[en];
            if ( temp > n ) en--;
            else if ( temp < n ) st++;
            else if ( temp == n ) {
                l = prme[st];
                r = prme[en];
                st++;
                en--;
            }
        }

        cout << l << ' ' << r << '\n';
    }
}
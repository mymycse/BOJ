#include <bits/stdc++.h>
using namespace std;

long int A,B,C;

long long func(long long b) {
    if ( b == 0 ) return 1;
    if ( b == 1 ) return A % C;

    long long temp = func(b/2) % C;

    if ( b % 2 == 0 ) return temp * temp % C;
    return ( temp * temp % C ) * ( A % C );
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> A >> B >> C;
    
    cout << func(B) % C;
}
#include <bits/stdc++.h>
using namespace std;

int N, M;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> M >> N;

    N *= 1440;
    N /= M;
    
    if ( N/60 < 10 )
        cout << '0';
    cout << (N/60) << ':';

    if ( N%60 < 10 )
        cout << '0';
    
    cout << N%60;
}
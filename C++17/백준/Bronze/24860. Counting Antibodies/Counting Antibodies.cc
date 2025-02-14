#include <bits/stdc++.h>
using namespace std;

long long vj1, vj2;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    long long res = 0;
    
    for ( int i = 0 ; i < 2 ; i++ ) {
        long long v,j;
        cin >> v >> j;
        
        res += (v*j);
    }

    for ( int i = 0 ; i < 3 ; i++ ) {
        long long temp;
        cin >> temp;
        res *= temp;
    }

    cout << res;
}
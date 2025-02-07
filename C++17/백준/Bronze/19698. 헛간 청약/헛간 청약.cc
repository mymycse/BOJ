#include <bits/stdc++.h>
using namespace std;

int N,W,H,L;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> W >> H >> L;

    int cows = (W/L)*(H/L);

    if ( cows > N ) cout << N;
    else cout << cows;
}
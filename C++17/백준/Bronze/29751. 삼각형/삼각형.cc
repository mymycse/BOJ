#include <bits/stdc++.h>
using namespace std;

int W, H;
double S;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> W >> H;

    S = (double)(W * H) / 2;

    cout << fixed;
    cout.precision(1);
    cout << S;
    
    return 0;
}
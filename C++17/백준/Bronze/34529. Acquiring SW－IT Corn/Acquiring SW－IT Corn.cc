#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int X, Y, Z, U, V, W;
    cin >> X >> Y >> Z;
    cin >> U >> V >> W;
    
    int res = (X*U)/100 + (Y*V)/50 + (Z*W)/20;
    cout << res << '\n';
    return 0;
}
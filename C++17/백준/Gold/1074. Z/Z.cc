#include <bits/stdc++.h>
using namespace std;

int result = 0;

int z(int n, int row, int col) {
    if ( n == 0 ) return result;
    int h = pow(2, n-1);

    if ( row < h ) {
        if ( col < h ) return z(n-1, row, col);
        else {
            result += h*h;
            return z(n-1, row, col-h);
        }
    } else {
        if ( col < h ) {
            result += h*h*2;
            return z(n-1, row-h, col);
        }
        else {
            result += h*h*3;
            return z(n-1, row-h, col-h);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, r, c;
    cin >> N >> r >> c;
    cout << z(N, r, c);

    return 0;
}
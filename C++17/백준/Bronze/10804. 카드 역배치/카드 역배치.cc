#include <bits/stdc++.h>
using namespace std;

int arr[21];

void flip(int st, int en) {
    while ( st < en ) {
        swap(arr[st++],arr[en--]);
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    for ( int i = 1 ; i <= 20 ; i++ )
        arr[i] = i;

    for ( int i = 0 ; i < 10 ; i++ ) {
        int a,b;
        cin >> a >> b;
        flip(a,b);
    }

    for ( int i = 1 ; i <= 20 ; i++ )
        cout << arr[i] << ' ';
}
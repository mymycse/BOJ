#include <bits/stdc++.h>
using namespace std;

int N,M;
int arr[8];
int res[8];

void func(int k) {
    if ( k == M ) {
        for ( int i = 0 ; i < M ; i++ )
            cout << res[i] << ' ';
        cout << '\n';
        return;
    }

    int prev = 0;
    for ( int i = 0 ; i < N ; i++ ) {
        if ( prev != arr[i] ) {
            prev = arr[i];
            res[k] = arr[i];
            func(k+1);
        }
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;
    for ( int i = 0 ; i < N ; i++ )
        cin >> arr[i];

    sort(arr,arr+N);

    func(0);

    return 0;
}
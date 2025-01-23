#include <bits/stdc++.h>
using namespace std;

int N,M;
int arr[9];
int res[9];

void func(int st, int dp) {
    if ( dp == M ) {
        for ( int i = 0 ; i < M ; i++ )
            cout << res[i] << ' ';
        cout << '\n';
        return;
    }

    int prev = 0;

    for ( int i = st ; i < N ; i++ ) {
        if ( prev != arr[i] ) {
            prev = arr[i];
            res[dp] = arr[i];
            func(i,dp+1);
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

    func(0,0);
    return 0;
}
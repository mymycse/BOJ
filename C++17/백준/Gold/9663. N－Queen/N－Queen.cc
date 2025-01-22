#include <bits/stdc++.h>
using namespace std;

int N;
int cnt = 0;
bool queen[15][15];
int arr[15];

bool isPossible(int k) {
    for ( int i = 0 ; i < k ; i++ ) {
        if ( arr[k] == arr[i] )
            return false;

        if ( abs(k-i) == abs(arr[k]-arr[i]) )
            return false;
    }

    return true;
}

void func(int k) {
    if ( k == N ) {
        cnt++;
        return;
    }

    for ( int i = 0 ; i < N ; i++ ) {
        arr[k] = i;

        if ( isPossible(k) ) {
            func(k+1);
        }
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    func(0);
    cout << cnt;
}
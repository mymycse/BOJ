#include <bits/stdc++.h>
using namespace std;

int N, S;
int arr[21];
int cnt = 0;

void func(int k, int total) {
    if ( k == N ) {
        if ( total == S ) cnt++;
        return;
    }

    func(k+1,total);
    func(k+1,total+arr[k]);
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> S;

    for ( int i = 0 ; i < N ; i++ )
        cin >> arr[i];

    func(0,0);

    if ( S == 0 ) cnt--;
    
    cout << cnt;

    return 0;
}
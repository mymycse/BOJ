#include <bits/stdc++.h>
using namespace std;

int N, K;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> K;

    vector<int> arr(N);
    for ( int i = 0 ; i < N ; i++ )
        cin >> arr[i];

    int st = 0;
    int oddCnt = 0;
    int res = 0;
    for ( int en = 0 ; en < N ; en++ ) {
        if ( arr[en]%2 == 1 )
            oddCnt++;

        while ( oddCnt > K && st < en ) {
            if ( arr[st++]%2 == 1 ) oddCnt--;
        }

        res = max(res, en-st+1-oddCnt);
    }

    cout << res;
    return 0;
}
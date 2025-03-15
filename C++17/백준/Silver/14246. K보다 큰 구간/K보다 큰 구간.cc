#include <bits/stdc++.h>
using namespace std;

long long sum[100001];
int n, k, num;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> n;
    
    for ( int i = 1 ; i <= n ; i++ ) {
        cin >> num;
        sum[i] = num + sum[i-1];
    }

    cin >> k;
    long long result = 0;

    for ( int i = 1 ; i <= n ; i++ ) {
        int j = 0;
        while ( sum[i]-sum[j] > k ) {
            result++;
            j++;
            if ( i == j ) break;
        }
    }

    cout << result;
    return 0;
}
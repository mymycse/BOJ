#include <bits/stdc++.h>
using namespace std;

int N;
stack <int> stk;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    int num[N+1];
    int ans[N+1];

    for ( int i = 0 ; i < N ; i++ )
        cin >> num[i];

    for ( int i = N-1 ; i >= 0 ; i-- ) {
        while ( !stk.empty() && stk.top() <= num[i] )
            stk.pop();
        
        ans[i] = stk.empty() ? -1 : stk.top();
        stk.push(num[i]);
    }

    for ( int i = 0 ; i < N ; i++ )
        cout << ans[i] << ' ';

    return 0;
}
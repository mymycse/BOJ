#include <bits/stdc++.h>
using namespace std;

long long A,B;
int cnt = INT_MAX;

void func(long long k, int depth) {
    if ( k == B ) {
        cnt = min(cnt, depth);
        return;
    } 
    
    if ( k > B || k < 0 ) return;

    func(k*2, depth+1);
    func(k*10+1,depth+1);
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> A >> B;
    
    func(A,1);

    if ( cnt == INT_MAX )
        cnt = -1;

    cout << cnt;
}
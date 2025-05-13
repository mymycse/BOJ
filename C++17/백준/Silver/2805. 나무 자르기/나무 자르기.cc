#include <bits/stdc++.h>
using namespace std;
vector<int> tree;

long max(long l1, long l2) {
    if ( l1 > l2 ) return l1;
    return l2;
}

long treeSum(long height) {
    long result = 0;
    for ( long h : tree )
        result += max(0, h-height);
    return result;
}

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    long N, M, temp, ll = 0;
    cin >> N >> M;

    tree.resize(N);
    for ( int i = 0 ; i < N ; i++ ) {
        cin >> temp;
        tree.push_back(temp);
        ll = max(ll,temp);
    }

    int l = 0, r = ll;

    while ( r-l != 1 ) {
        int mid = (l+r)/2;
        if ( treeSum(mid) >= M ) {
            l = mid;
        }
        else {
            r = mid;
        }
    }

    cout << l;
    return 0;
}
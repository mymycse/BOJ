#include <bits/stdc++.h>
using namespace std;
using ll = long long;
typedef pair<ll,ll> pll;

int ccw(pll a, pll b, pll c) {
    ll x = a.first*b.second + b.first*c.second + c.first*a.second;
    ll y = b.first*a.second + c.first*b.second + a.first*c.second;

    if ( x > y ) return 1;
    else if ( x == y ) return 0;
    else return -1;
}

int calc(pair<pll,pll> p1, pair<pll,pll> p2) {
    pll l1 = p1.first, l2 = p1.second, l3 = p2.first, l4 = p2.second;
    ll ccw1 = ccw(l1,l2,l3) * ccw(l1,l2,l4);
    ll ccw2 = ccw(l3,l4,l1) * ccw(l3,l4,l2);

    if ( ccw1 == 0 && ccw2 == 0 ) {
        if ( l1 > l2 ) swap(l1,l2);
        if ( l3 > l4 ) swap(l3,l4);
        return (l1 <= l4 && l3 <= l2);
    }
    else return (ccw1 <= 0 && ccw2 <= 0);
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    ll x, y;
    vector <pll> vec;

    for ( int i = 0 ; i < 4 ; i++ ) {
        cin >> x >> y ;
        vec.push_back({x,y});
    }

    cout << calc({vec[0],vec[1]},{vec[2],vec[3]});
    return 0;
}
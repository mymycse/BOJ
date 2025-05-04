#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N, h;
    cin >> N;

    vector<int> building;
    for ( int i = 0 ; i < N ; i++ ) {
        cin >> h;
        building.push_back(h);
    }

    int res = 0;

    for ( int i = 0 ; i < N ; i++ ) {
        int cnt = 0;
        for ( int j = 0 ; j < N ; j++ ) {
            if ( i == j ) continue;

            bool visible = true;
            int a = min(i,j);
            int b = max(i,j);

            for ( int k = a+1 ; k < b ; k++ ) {
                double y = (double)(building[j]-building[i])/(j-i) * (k-i) + building[i];
                if ( building[k] >= y ) {
                    visible = false;
                    break;
                }
            }
            if ( visible ) cnt++;
        }
        res = max(res, cnt);
    }

    cout << res;
    return 0;
}
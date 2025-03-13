#include <bits/stdc++.h>
using namespace std;
#define all(v) v.begin(), v.end()

int N, Ai, k;
vector<int> v;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);

	cin >> N;
    v.push_back(INT_MIN);

    for ( int i = 0 ; i < N ; i++ ) {
        cin >> Ai;
        if ( Ai > v.back() ) v.push_back(Ai);
        else {
            k = lower_bound( all(v), Ai ) - v.begin();
            v[k] = Ai;
        }
    }

    cout << v.size() - 1;
	return 0;
}
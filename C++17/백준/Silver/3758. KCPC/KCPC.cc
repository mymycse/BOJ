#include <bits/stdc++.h>
using namespace std;

int T, n, k, t, m, id, num, score;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int T;
	cin >> T;

	while ( T-- ) {
		cin >> n >> k >> t >> m;
		int arr[101][101] = {};
		int cnt[101] = {};
		int order[101] = {};
		t--;
		for ( int i = 0 ; i < m ; i++ ) {
			cin >> id >> num >> score;
            id--; num--;

			arr[id][num] = max(arr[id][num], score);
			cnt[id]++;
			order[id] = i;
		}

		vector<pair<pair<int, int>, pair<int, int>>> result;
		for ( int i = 0 ; i < n ; i++ ) {
			int sum = 0;
			for ( int j = 0 ; j < k ; j++ )
				sum += arr[i][j];
                result.push_back({{sum, -cnt[i]}, {-order[i], i}});
		}

		sort( result.begin(), result.end() );
		for ( int i = 0 ; i < n ; i++ )
			if ( result[i].second.second == t ) 
                cout << n-i << '\n';
	}
	return 0;
}

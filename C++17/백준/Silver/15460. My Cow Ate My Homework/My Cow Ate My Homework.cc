#include <bits/stdc++.h>
using namespace std;

int compare(pair<long,long> a, pair<long,long> b) {
	if (a.first / a.second != b.first / b.second)
		return b.first / b.second - a.first / a.second;
	return b.first * a.second - a.first * b.second;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int N; 
    cin >> N;
    
	vector<int> v(N);
	for (int i = 0; i < N; i++) cin >> v[i];

	vector<int> ans;
	long long sum = v[N-1], minVal = v[N-1];
	pair<long,long> maxScore = { 0, 1 };
    
	for (int i = N-2; i >= 1; i--) {
		sum += v[i];
		if (minVal > v[i]) minVal = v[i];
		pair<long,long> divres = { (sum - minVal), (N-i-1) };
		if (0 <= compare(maxScore, divres)) {
			if (0 < compare(maxScore, divres)) ans.clear();
			ans.push_back(i);
			maxScore = divres;
		}
	}
    
	sort(ans.begin(), ans.end());
	for (int n : ans) cout << n << ' ';
	return 0;
}

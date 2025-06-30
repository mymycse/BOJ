#include <bits/stdc++.h>
using namespace std;
long long d[1000001];

void solution(int N) {
	if (N <= 10) {
		cout << N;
		return;
	}

	for (int i = 0; i < 10; i++) {
		d[i] = i;
	}

	int idx = 10;
	for (int i = 1 ; i <= N ; i++) {
		for (int j = 0 ; j < d[i]%10 ; j++) {
			d[idx] = d[i]*10 + j;
			idx++;
		}
	}

	if (d[N] == 0) cout << -1;
	else cout << d[N];
}

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);

    int N;
	cin >> N;
	solution(N);
	
	return 0;
}
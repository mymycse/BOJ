#include <bits/stdc++.h>
using namespace std;

int N, K;
int dist[100001], ways[100001];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> K;

    if (N == K) {
        cout << "0\n1";
        return 0;
    }

    queue<int> qu;
    qu.push(N);
    dist[N] = 0;
    ways[N] = 1;

    while (!qu.empty()) {
        int loc = qu.front();
        qu.pop();

        for ( int next : {loc-1, loc+1, loc*2} ) {
            if (next < 0 || next > 100000) continue;

            if ( dist[next] == 0 && next != N ) { // 처음 방문하는 경우
                dist[next] = dist[loc] + 1;
                ways[next] = ways[loc];
                qu.push(next);
            } 
            else if ( dist[next] == dist[loc] + 1 ) { // 같은 시간에 도달한 경우
                ways[next] += ways[loc];
            }
        }
    }

    cout << dist[K] << '\n' << ways[K] << '\n';
    return 0;
}

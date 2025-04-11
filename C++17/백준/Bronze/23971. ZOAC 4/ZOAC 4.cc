#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int H, W, N, M;
    cin >> H >> W >> N >> M;

    int r = (H+N)/(N+1);
    int c = (W+M)/(M+1);
    int result = r*c;
    cout << result;
}
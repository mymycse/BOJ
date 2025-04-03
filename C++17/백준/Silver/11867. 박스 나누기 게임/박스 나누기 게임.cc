#include <bits/stdc++.h>
using namespace std;

int dp[101][101];

int recursion(int x, int y) {
    if (x == 0 || y == 0 || x > y)
        return 0;
    
    if (x == 1 && y == 1)
        return 2;

    if (dp[x][y] != -1) 
        return dp[x][y];

    dp[x][y] = 0;
    for (int i = 1; i <= y / 2; i++) {
        int temp = recursion(i, y - i);
        if (temp == 0 || temp == 2) {
            return dp[x][y] = 1;
        }
    }

    for (int i = 1; i <= x / 2; i++) {
        int temp = recursion(i, x-i);
        if (temp == 0 || temp == 2) {
            return dp[x][y] = 1;
        }
    }

    return dp[x][y];
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    memset(dp, -1, sizeof(dp));

    int N, M;
    cin >> N >> M;

    if (N > M) 
        swap(N, M);
    
    int result = recursion(N, M);
    if (result == 1)
        cout << "A\n";
    else
        cout << "B\n";

    return 0;
}

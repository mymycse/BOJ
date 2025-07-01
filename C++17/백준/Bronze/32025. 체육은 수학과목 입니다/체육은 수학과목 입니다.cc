#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int a, b;
    cin >> a >> b;
    
    int res = min(a,b);
    res *= 50;
    
    cout << res;
    return 0;
}
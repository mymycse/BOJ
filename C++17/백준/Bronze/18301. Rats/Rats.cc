#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int a, b, c;
    cin >> a >> b >> c;
    
    int res = (a+1)*(b+1)/(c+1) - 1;
    cout << res;
    
    return 0;
}
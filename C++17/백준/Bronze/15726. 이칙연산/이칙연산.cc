#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int a, b, c;
    cin >> a >> b >> c;
    
    double res1 = (double)a*b/c;
    double res2 = (double)a/b*c;
    
    cout << (int)max(res1, res2);
    return 0;
}
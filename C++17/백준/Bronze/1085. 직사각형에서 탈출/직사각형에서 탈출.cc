#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int x, y, w, h;
    cin >> x >> y >> w >> h;
    
    int result = min(x,y);
    result = min(result, min(abs(x-w), abs(y-h)));
    
    cout << result;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int a, b, c;
    cin >> a >> b >> c;
    int max = a*3 + b*20 + c*120;
    
    cin >> a >> b >> c;
    int mel = a*3 + b*20 + c*120;
    
    if ( max > mel ) cout << "Max";
    else if ( max < mel ) cout << "Mel";
    else cout << "Draw";
    
    return 0;
}
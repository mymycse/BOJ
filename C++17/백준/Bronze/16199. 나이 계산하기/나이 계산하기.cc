#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int y1, m1, d1, y2, m2, d2;
    cin >> y1 >> m1 >> d1;
    cin >> y2 >> m2 >> d2;
    
    int age1 = y2 - y1;
    if (m2 < m1 || (m2 == m1 && d2 < d1)) age1--;
    
    int age2 = y2 - y1 + 1;
    
    int age3 = y2 - y1;
    
    cout << age1 << '\n' << age2 << '\n' << age3 << '\n';
    return 0;
}
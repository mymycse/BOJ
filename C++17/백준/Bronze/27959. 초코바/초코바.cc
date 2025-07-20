#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int N, M;
    cin >> N >> M;
    
    if ( N*100 >= M ) cout << "Yes";
    else cout << "No";
    
    return 0;
}
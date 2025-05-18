#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int cnt = 0;
    int res, num;
    cin >> res;
    
    while ( true ) {
        char op;
        cin >> op;
        if ( op == '=' ) {
            cout << res;
            return 0;
        }
        cin >> num;
        if ( op == '+' ) res += num;
        else if ( op == '-' ) res -= num;
        else if ( op == '*' ) res *= num;
        else if ( op = '/' ) res /= num;
    }
}
#include <bits/stdc++.h>
using namespace std;

string str;
stack<char> stk;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> str;
    int res = 0;
    int temp = 1;
    int len = str.length();
    for ( int i = 0 ; i < len ; i++ ) {
        if ( str[i] == '(' ) {
            temp *= 2;
            stk.push(str[i]);
        }
        else if ( str[i] == '[' ) {
            temp *= 3;
            stk.push(str[i]);
        }
        else if ( str[i] == ')' ) {
            if ( stk.empty() || stk.top() != '(' ) {
                cout << 0;
                return 0;
            }
            if ( str[i-1] == '(' ) res += temp;
            stk.pop();
            temp /= 2;
        }
        else if ( str[i] == ']' ) {
            if ( stk.empty() || stk.top() != '[' ) {
                cout << 0;
                return 0;
            }
            if ( str[i-1] == '[' ) res += temp;
            stk.pop();
            temp /= 3;
        }
    }

    if ( !stk.empty() ) cout << 0;
    else cout << res;

    return 0;
}
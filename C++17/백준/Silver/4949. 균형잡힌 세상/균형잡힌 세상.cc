#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    while ( true ) {
        string str;
        getline(cin, str);

        if ( str == "." ) break;

        stack<char> stk;
        bool result = true;

        for ( auto a : str ) {
            if ( a == '(' || a == '[' ) stk.push(a);
            else if ( a == ')' ) {
                if ( !stk.empty() && stk.top() == '(' ) stk.pop();
                else {
                    result = false;
                    break;
                }
            } else if ( a == ']' ) {
                if ( !stk.empty() && stk.top() == '[' ) stk.pop();
                else {
                    result = false;
                    break;
                }
            }
        }

        if ( !result || !stk.empty() )
            cout << "no\n";
        else cout << "yes\n";
    }
}
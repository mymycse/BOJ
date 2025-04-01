#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    stack<char> stk;
    string S;
    string res = "";

    cin >> S;
    int len = S.length();

    for ( int i = 0 ; i < len ; i++ ) {
        char ch = S[i];
        
        switch (ch) {
        case '(':
            stk.push(ch);
            break;
        case ')':
            while ( !stk.empty() ) {
                char top = stk.top();
                stk.pop();
                if ( top == '(' ) break;
                res += top;
            }
            break;
        case '+':
        case '-':
            while ( !stk.empty() ) {
                char top = stk.top();
                if ( top != '(' ) {
                    res += top;
                    stk.pop();
                    continue;
                }
                else 
                    break;
            }
            stk.push(ch);
            break;
        case '*':
        case '/':
            while ( !stk.empty() ) {
                char top = stk.top();
                if ( top == '*' || top == '/' ) {
                    res += top;
                    stk.pop();
                    continue;
                }
                else break;
            }
            stk.push(ch);
            break;
        default:
            res += ch;
            break;
        }
    }

    while ( !stk.empty() ) {
        char top = stk.top();
        stk.pop();
        if ( top != '(' ) res += top;
    }

    cout << res;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    double arr[26];
    string str;
    cin >> N >> str;

    for ( int i = 0 ; i < N ; i++ )
        cin >> arr[i];

    stack<double> stk;
    int len = str.length();

    for ( int i = 0 ; i < len ; i++ ) {
        char ch = str[i];

        if ( ch >= 'A' && ch <= 'Z' ) {
            int num = ch - 'A';
            stk.push(arr[num]);
        }
        else {
            double n2 = stk.top(); stk.pop();
            double n1 = stk.top(); stk.pop();
            switch (ch) {
                case '+':
                    stk.push(n1+n2);
                    break;
                case '-':
                    stk.push(n1-n2);
                    break;
                case '*':
                    stk.push(n1*n2);
                    break;
                case '/':
                    stk.push(n1/n2);
                    break;
            }
        }
    }

    double result = stk.top();
    printf("%.2f", result);
    return 0;
}
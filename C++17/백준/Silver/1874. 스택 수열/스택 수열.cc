#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    stack<int> stk;
    int cnt = 1;
    string answer;

    while ( n-- ) {
        int t;
        cin >> t;

        while ( cnt <= t ) {
            stk.push(cnt++);
            answer += "+\n";
        }

        if ( stk.top() != t ) {
            cout << "NO";
            return 0;
        }

        stk.pop();
        answer += "-\n";
    }

    cout << answer;
    return 0;
}
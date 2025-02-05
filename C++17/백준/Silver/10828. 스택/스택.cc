#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;

    stack<int> st;

    while ( N-- ) {
        string cmd;
        cin >> cmd;

        if ( cmd == "push" ) {
            int X;
            cin >> X;
            st.push(X);
        }
        else if ( cmd == "pop" ) {
            if ( st.empty() ) cout << -1 << '\n';
            else {
                cout << st.top() << '\n';
                st.pop();
            }
        }
        else if ( cmd == "size" ) {
            cout << st.size() << '\n';
        }
        else if ( cmd == "empty" ) {
            cout << (int)st.empty() << '\n';
        }
        else if ( cmd == "top" ) {
            if ( st.empty() ) cout << -1 << '\n';
            else cout << st.top() << '\n';
        }
    }

    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int N;
stack<pair<int,int>> stk;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    stk.push({100000001,0});

    for ( int i = 1 ; i <= N ; i++ ) {
        int tower;
        cin >> tower;

        while ( stk.top().first < tower )
            stk.pop();

        cout << stk.top().second << " ";
        stk.push({tower,i});
    }

    return 0;
}
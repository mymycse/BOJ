#include <bits/stdc++.h>
using namespace std;

int N;
queue <int> q;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    for ( int i = 1 ; i <= N ; i++ )
        q.push(i);

    while ( true ) {
        if ( q.size() == 1 )
            break;

        q.pop();
        q.push(q.front());
        q.pop();
    }

    cout << q.front();
}
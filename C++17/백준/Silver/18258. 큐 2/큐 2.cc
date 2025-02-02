#include <bits/stdc++.h>
using namespace std;

queue<int> q;
int N;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    cin >> N;
    
    string command;
    for ( int i = 0 ; i < N ; i++ ) {
        cin >> command;

        if ( command.compare("push") == 0 ) {
            int r;
            cin >> r;
            q.push(r);
            continue;
        } 
        
        if ( command.compare("pop") == 0 ) {
            if ( q.empty() )
                cout << -1;
            else {
                cout << q.front();
                q.pop();
            }
        } else if ( command.compare("size") == 0 ) {
            cout << q.size();
        } 
        else if ( command.compare("empty") == 0 ) {
            cout << (q.empty() ? 1 : 0);
        } 
        else if ( command.compare("front") == 0 ) {
            cout << ( q.empty() ? -1 : q.front() );
        } 
        else if ( command.compare("back") == 0 ) {
            cout << ( q.empty() ? -1 : q.back() );
        }

        cout << '\n';
    }

    return 0;
}
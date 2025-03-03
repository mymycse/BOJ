#include <bits/stdc++.h>
using namespace std;

int N, K;
bool b[100001];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> K;

    if ( N == K ) {
        cout << 0;
        return 0;
    }
    
    queue<int> qu;
    qu.push(N);
    b[N] = true;

    int sec = 1;
    
    while ( !qu.empty() ) {
        int tempSize = qu.size();
        while ( tempSize-- ) {
            int loc = qu.front();
            qu.pop();

            for ( int tempLoc : {loc-1, loc+1, loc*2} ) {
                if ( tempLoc < 0 || tempLoc > 100000 ) continue;
                if ( b[tempLoc] ) continue;
                if ( tempLoc == K ) {
                    cout << sec;
                    return 0;
                }

                b[tempLoc] = true;
                qu.push(tempLoc);
            }
        }

        sec++;
    }
}
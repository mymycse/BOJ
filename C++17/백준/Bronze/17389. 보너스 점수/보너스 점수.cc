#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int N;
    string str;
    
    cin >> N >> str;
    int bonus = 0;
    long long score = 0;
    
    for ( int i = 1 ; i <= N ; i++ ) {
        if ( str[i-1] == 'O' ) {
            score += (i+bonus);
            bonus++;
        }
        else {
            bonus = 0;
        }
    }
    
    cout << score;
    return 0;
}
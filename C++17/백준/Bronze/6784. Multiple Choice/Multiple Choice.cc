#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int N;
    cin >> N;
    
    char choice[N];
    for ( int i = 0 ; i < N ; i++ )
        cin >> choice[i];
    
    char ans;
    int score = 0;
    for ( int i = 0 ; i < N ; i++ ) {
        cin >> ans;
        if ( choice[i] == ans ) score++;
    }
    
    cout << score;
    return 0;
}
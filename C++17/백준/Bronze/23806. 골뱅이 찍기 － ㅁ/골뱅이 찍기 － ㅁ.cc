#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int N;
    cin >> N;
    
    for ( int i = 0 ; i < N ; i++ ) {
        for ( int j = 0 ; j < N ; j++ ) 
            cout << "@@@@@";
        cout << '\n';
    }
    
    for ( int i = 0 ; i < 3*N ; i++ ) {
        for ( int a = 0 ; a < N ; a++ ) cout << '@';
        for ( int b = 0 ; b < N ; b++ ) cout << "   ";
        for ( int c = 0 ; c < N ; c++ ) cout << '@';
        cout << '\n';
    }
    
    for ( int i = 0 ; i < N ; i++ ) {
        for ( int j = 0 ; j < N ; j++ ) 
            cout << "@@@@@";
        cout << '\n';
    }
    
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    int N;
    cin >> N;
    
    for ( int k = 0 ; k < 2 ; k++ ) {
        for ( int i = 0 ; i < N ; i++ ) {
            for ( int j = 0 ; j < N ; j++ ) cout << '@';
            for ( int j = 0 ; j < N ; j++ ) cout << "   ";
            for ( int j = 0 ; j < N ; j++ ) cout << '@';
            cout << '\n';
        }
    
        for ( int i = 0 ; i < N ; i++ ) {
            for ( int j = 0 ; j < N ; j++ ) cout << "@@@@@";
            cout << '\n';
        }
    }

    for ( int i = 0 ; i < N ; i++ ) {
        for ( int j = 0 ; j < N ; j++ ) cout << '@';
        for ( int j = 0 ; j < N ; j++ ) cout << "   ";
        for ( int j = 0 ; j < N ; j++ ) cout << '@';
        cout << '\n';
    }
    
    return 0;
}
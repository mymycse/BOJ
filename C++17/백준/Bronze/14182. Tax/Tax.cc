#include <bits/stdc++.h>
using namespace std;

int main(void) {
    int N;
    while ( true ) {
        cin >> N;
        if ( N == 0 ) break;

        if ( N > 5000000 ) 
            N -= N*0.2;
        else if ( N > 1000000 )
            N -= N*0.1;

        cout << N << '\n';
    }
}
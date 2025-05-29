#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    int n, m;
    cin >> n >> m;
    
    for ( int i = 0 ; i < n ; i++ ) {
        for ( int j = 0 ; j < m ; j++ ) {
            if ( i%2 == 0 ) {
                if ( j%2 == 0 ) printf("*");
                else printf(".");
            }
            else {
                if ( j%2 == 0 ) printf(".");
                else printf("*");
            }
        }
        printf("\n");
    }
    
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int N;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    int minOdd = 1001;
    int candies = 0;

    int temp;
    for ( int i = 0 ; i < N ; i++ ) {
        cin >> temp;

        if ( temp%2 == 1 && temp < minOdd )
            minOdd = temp;

        candies += temp;
    }

    if ( candies%2 == 0 )
        cout << candies;
    else if ( minOdd == 1001 )
        cout << 0;
    else
        cout << (candies-minOdd);

    return 0;
}
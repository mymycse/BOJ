#include <bits/stdc++.h>
using namespace std;

int S1, S2, S3;
int dice[81];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> S1 >> S2 >> S3;

    for ( int i = 1 ; i <= S1 ; i++ )
        for ( int j = 1 ; j <= S2 ; j++ )
            for ( int k = 1 ; k <= S3 ; k++ )
                dice[i+j+k]++;

    int max = 0;
    int result;

    for ( int i = 3 ; i <= 80 ; i++ )
        if ( dice[i] > max ) {
            result = i;
            max = dice[i];
        }
    cout << result;

    return 0;
}
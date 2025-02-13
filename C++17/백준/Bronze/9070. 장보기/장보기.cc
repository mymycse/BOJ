#include <bits/stdc++.h>
using namespace std;

int T;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> T;
    while ( T-- ) {
        int N;
        cin >> N;

        int arr[N+1][3];
        for ( int i = 0 ; i < N ; i++ )
            cin >> arr[i][0] >> arr[i][1];

        double db = (double)arr[0][1]/arr[0][0];
        int min = arr[0][1];

        for ( int i = 1 ; i < N ; i++ ) {
            double temp = (double)arr[i][1]/arr[i][0];
            if ( temp < db ) {
                db = temp;
                min = arr[i][1];
            } else if ( temp == db ) {
                if ( min > arr[i][1] )
                    min = arr[i][1];
            }
        }

        cout << min << '\n';
    }
}
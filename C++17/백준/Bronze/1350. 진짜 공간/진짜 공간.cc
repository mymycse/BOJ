#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;

    int files[N+1];
    for ( int i = 0 ; i < N ; i++ )
        cin >> files[i];
    
    int cluster;
    cin >> cluster;

    long long size = 0;
    for ( int i = 0 ; i < N ; i++ ) {
        size += files[i]/cluster;

        if ( files[i]%cluster != 0 ) size++;
    }

    size *= cluster;
    cout << size;
}
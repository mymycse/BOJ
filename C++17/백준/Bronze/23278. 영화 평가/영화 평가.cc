#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int N, L, H;
    cin >> N >> L >> H;
    
    int score[N];
    for ( int i = 0 ; i < N ; i++ )
        cin >> score[i];
    
    sort(score, score+N);
    
    double res = 0;
    for ( int i = L ; i < N-H ; i++ )
        res += score[i];
    
    printf("%.9f", res/(N-L-H));
    return 0;
}
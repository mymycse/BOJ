#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int T, A, B, C, D, E;
    cin >> T;

    while ( T-- ) {
        cin >> A >> B >> C >> D >> E;
        double sum = 0.0;
        sum += A*350.34;
        sum += B*230.90;
        sum += C*190.55;
        sum += D*125.30;
        sum += E*180.90;
        printf("$%.2f\n", sum);
    }
}
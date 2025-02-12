#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int L;
    cin >> L;

    int result = L/5;
    if ( L%5 != 0 ) result++;

    cout << result;
}
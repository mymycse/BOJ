#include <bits/stdc++.h>
using namespace std;

int N, M;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;

    double totalArea = N*M;
    double acres = totalArea/4840.0;
    int bags = ceil(acres/5.0);

    cout << bags;

    return 0;
}
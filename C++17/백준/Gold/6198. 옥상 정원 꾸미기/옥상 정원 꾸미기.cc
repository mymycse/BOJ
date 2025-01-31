#include <bits/stdc++.h>
using namespace std;

int N;
long long result = 0;
long long height;
stack <int> building;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;

    for ( int i = 1 ; i <= N ; i++ ) {
        cin >> height;

        while ( !building.empty() && building.top() <= height )
            building.pop();

        result += building.size();
        building.push(height);
    }

    cout << result;

    return 0;
}
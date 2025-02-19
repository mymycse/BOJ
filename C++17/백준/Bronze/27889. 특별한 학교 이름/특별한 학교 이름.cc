#include <bits/stdc++.h>
using namespace std;

string name;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> name;

    if ( name.compare("NLCS") == 0 )
        cout << "North London Collegiate School";
    else if ( name.compare("BHA") == 0 )
        cout << "Branksome Hall Asia";
    else if ( name.compare("KIS") == 0 )
        cout << "Korea International School";
    else if ( name.compare("SJA") == 0 )
        cout << "St. Johnsbury Academy";

    return 0;
}
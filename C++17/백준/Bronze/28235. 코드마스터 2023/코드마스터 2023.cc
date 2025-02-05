#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string str;
    cin >> str;

    if ( str.compare("SONGDO") == 0 )
        cout << "HIGHSCHOOL";
    else if ( str.compare("CODE") == 0 )
        cout << "MASTER";
    else if ( str.compare("2023") == 0 )
        cout << "0611";
    else if ( str.compare("ALGORITHM") == 0 )
        cout << "CONTEST";
}
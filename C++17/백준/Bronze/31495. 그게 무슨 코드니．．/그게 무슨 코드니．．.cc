#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    string str;
    getline(cin,str);

    int len = str.length();

    if ( len <= 2 ) cout << "CE";
    else if ( str[0] == '\"' && str[len-1] == '\"' ) cout << str.substr(1, len-2);
    else cout << "CE";

    return 0;
}
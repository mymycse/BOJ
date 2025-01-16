#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s1, s2;
    cin >> s1 >> s2;

    int a[26] = {};
    for ( auto c : s1 ) a[c-'a']++;
    for ( auto c : s2 ) a[c-'a']--;

    int result = 0;
    for ( int i : a ) result += abs(i);

    cout << result;
}
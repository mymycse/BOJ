#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    char arr[] = {'A', 'a', 'b', 'D', 'd', 'e', 'g', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', '@'};
    string s;
    getline(cin, s);
    int len = s.length();
    int result = 0;

    for ( int i = 0 ; i < len ; i++ ) {
        char ch = s[i];
        if ( ch == 'B' ) result += 2;
        else {
            for ( char c : arr )
                if ( c == ch ) {
                    result++;
                    break;
                }
        }
    }

    cout << result;
}
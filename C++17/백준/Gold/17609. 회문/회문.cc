#include <bits/stdc++.h>
using namespace std;

int T, ans;
string str;

void palindrome(int s, int e, int cnt) {
    while ( s < e ) {
        if ( str[s] == str[e] ) {
            s++;
            e--;
            continue;
        }

        if ( cnt == 1 ) {
            if ( ans == -1 ) ans = 2;
            return;
        }

        palindrome(s+1, e, 1);
        palindrome(s, e-1, 1);
        return;
    }

    ans = cnt;
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> T;
    while ( T-- ) {
        cin >> str;
        ans = -1;
        palindrome(0, str.length()-1, 0);
        cout << ans << '\n';
    }

    return 0;
}
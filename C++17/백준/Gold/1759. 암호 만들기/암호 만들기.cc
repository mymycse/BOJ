#include <bits/stdc++.h>
using namespace std;

int L,C;
char a[16];
char pw[16];
char vowel[] = {'a','e','i','o','u'};
int cnt = 0;

bool isvowel ( char ch ) {
    for ( char v : vowel ) {
        if ( v == ch )
            return true;
    }

    return false;
}

void password(int len, int st) {
    if ( len == L && cnt >= 1 && (len-cnt) >= 2 ) {
        for ( int i = 0 ; i < L ; i++ )
            cout << pw[i];
        cout << '\n';
        return;
    }

    for ( int i = st ; i < C ; i++ ) {
        bool isv = isvowel(a[i]);

        if ( isv ) cnt++;
        
        pw[len] = a[i];
        password(len+1,i+1);

        if ( isv ) cnt--;
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> L >> C;
    for ( int i = 0 ; i < C ; i++ )
        cin >> a[i];

    sort(a,a+C);

    password(0,0);
    return 0;
}
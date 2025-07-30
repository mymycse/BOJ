#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    string str1, str2;
    cin >> str1 >> str2;
    
    int l1 = str1.length();
    int l2 = str2.length();
    
    int arr[26];
    fill_n(arr, 26, 0);
    
    for ( int i = 0 ; i < l1 ; i++ )
        arr[str1[i]-'a']++;
    
    for ( int i = 0 ; i < l2 ; i++ ) {
        if ( arr[str2[i]-'a'] == 0 )
            cout << str2[i];
    }
    
    return 0;
}
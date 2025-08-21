#include <bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;
    cin.ignore();

    string str;
    for (int i = 1; i <= N; i++) {
        getline(cin, str);

        int a[26] = {0};
        for (char c : str) {
            if (isalpha(c)) {
                c = tolower(c);
                a[c-'a']++;
            }
        }

        int mn = 3;
        for (int j = 0; j < 26; j++) {
            mn = min(mn, a[j]);
        }

        cout << "Case " << i << ": ";
        if (mn >= 3) cout << "Triple pangram!!!\n";
        else if (mn >= 2) cout << "Double pangram!!\n";
        else if (mn >= 1) cout << "Pangram!\n";
        else cout << "Not a pangram\n";
    }
    return 0;
}

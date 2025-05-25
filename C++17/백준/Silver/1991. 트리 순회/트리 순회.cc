#include <bits/stdc++.h>
using namespace std;
pair<char, char> node[26];

void preorder(char cur) {
    if ( cur == '.' ) return;

    cout << cur;
    preorder(node[cur-'A'].first);
    preorder(node[cur-'A'].second);
}

void inorder(char cur) {
    if ( cur == '.' ) return;

    inorder(node[cur-'A'].first);
    cout << cur;
    inorder(node[cur-'A'].second);
}

void postorder(char cur) {
    if ( cur == '.' ) return;

    postorder(node[cur-'A'].first);
    postorder(node[cur-'A'].second);
    cout << cur;
}
int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int N;
    char c, r, l;
    cin >> N;

    for ( int i = 0 ; i < N ; i++ ) {
        cin >> c >> l >> r;
        node[c-'A'].first = l;
        node[c-'A'].second = r;
    }

    preorder('A');
    cout << '\n';
    inorder('A');
    cout << '\n';
    postorder('A');
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int N;
long long wall[200001];

void repair(int c, int x) {
    int sound = x;
    for ( int i = c ; i > 0 ; i-- ) {
        if ( sound > wall[i] ) {
            sound -= wall[i];
            wall[i] *= 2;
        }
        else {
            wall[i] += sound;
            break;
        }
    }

    sound = x;
    for ( int i = c+1 ; i <= N ; i++ ) {
        if ( sound > wall[i] ) {
            sound -= wall[i];
            wall[i] *= 2;
        }
        else {
            wall[i] += sound;
            break;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    
    cin >> N;

    for ( int i = 1 ; i <= N ; i++ )
        cin >> wall[i];

    int Q;
    cin >> Q;

    while ( Q-- ) {
        int op, c, x;
        cin >> op;

        if ( op == 1 ) {
            cin >> c >> x;
            repair(c, x);
        }
        else if ( op == 2 ) {
            cin >> c;
            cout << wall[c] << '\n';
        }
    }

    return 0;
}
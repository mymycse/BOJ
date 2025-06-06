#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    int n;
    cin >> n;
    
    while ( n-- ) {
        string name;
        cin >> name;
        
        if ( name.compare("anj") == 0 ) {
            cout << "뭐야;";
            return 0;
        }
    }
    
    cout << "뭐야?";
    return 0;
}
#include <sstream>
#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;

    for ( int i = 0 ; i < T ; i++ ) {
        int x,y;
        cin >> x >> y;

        if ( x < 24 && y < 60 ) cout << "Yes ";
        else    cout << "No ";
        
        if ( x == 0 || y == 0 || x > 12 )
            cout << "No" << endl;
        else if ( x == 2 ) {
            if ( y < 30 )   cout << "Yes" << endl;
            else            cout << "No" << endl;
        } else if ( x < 8 ) {
            if ( x%2 == 0 && y <= 30 || x%2 == 1 && y <= 31 )   cout << "Yes" << endl;
            else    cout << "No" << endl;
        } else {
            if ( x%2 == 0 && y <= 31 || x%2 == 1 && y <= 30 )   cout << "Yes" << endl;
            else    cout << "No" << endl;
        }
    }
}
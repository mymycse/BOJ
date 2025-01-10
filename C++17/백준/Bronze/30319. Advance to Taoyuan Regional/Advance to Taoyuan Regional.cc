#include <iostream>
#include <sstream>
using namespace std;

int main() {
    int year, month, day;
    char d1,d2;

    cin >> year >> d1 >> month >> d2 >> day;
    if ( month < 9 || ( month == 9 && day <= 16 ) )
        cout << "GOOD";
    else
        cout << "TOO LATE";

    return 0;
}
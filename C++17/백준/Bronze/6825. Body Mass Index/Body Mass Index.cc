#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    double w, h;
    cin >> w >> h;
    
    double bmi = w/(h*h);
    if ( bmi > 25.0 ) cout << "Overweight";
    else if ( bmi >= 18.5 ) cout << "Normal weight";
    else cout << "Underweight";
    
}
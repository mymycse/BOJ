#include <bits/stdc++.h>
using namespace std;

double area(const pair<int, int>& a, const pair<int, int>& b, const pair<int, int>& c) {
    return abs(a.first * b.second + b.first * c.second + c.first * a.second
             - a.second * b.first - b.second * c.first - c.second * a.first) / 2.0;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    vector<pair<int, int>> points(n);
    for (int i = 0; i < n; ++i) {
        cin >> points[i].first >> points[i].second;
    }

    double maxArea = 0;
    for (int a = 0; a < n; ++a) {
        for (int b = a+1; b < n; ++b) {
            for (int c = b+1; c < n; ++c) {
                maxArea = max(maxArea, area(points[a], points[b], points[c]));
            }
        }
    }

    cout << fixed << setprecision(10) << maxArea;

    return 0;
}
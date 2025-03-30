#include <bits/stdc++.h>
using namespace std;

int getAnswer(const string& cond, const string& comb) {
    unordered_map<string, int> hm;
    stringstream condStream(cond);
    string token;

    while (getline(condStream, token, ',')) {
        size_t colon = token.find(':');
        string key = token.substr(0, colon);
        int value = stoi(token.substr(colon + 1));
        hm[key] = value;
    }

    int result = INT_MAX;
    stringstream combStream(comb);
    string group;

    while (getline(combStream, group, '|')) {
        stringstream groupStream(group);
        string item;
        int localMax = INT_MIN;

        while (getline(groupStream, item, '&')) {
            item.erase(remove_if(item.begin(), item.end(), ::isspace), item.end()); // 공백 제거
            localMax = max(localMax, hm[item]);
        }
        result = min(result, localMax);
    }

    return result;
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int T;
    cin >> T;
    cin.ignore();

    while (T--) {
        string cond, comb;
        getline(cin, cond);
        getline(cin, comb);

        cout << getAnswer(cond, comb) << '\n';
    }

    return 0;
}
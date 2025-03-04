#include <bits/stdc++.h>
using namespace std;

int N, K;
vector<int> loc(100001, -1);
queue<int> subin;

void jump(int l) {
    while ( l*2 <= 100000 ) {
        int temp = l*2;
        if ( loc[temp] != -1 ) return;

        loc[temp] = loc[l];
        subin.push(temp);
        l *= 2;
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> K;

    if ( N == K ) {
        cout << 0;
        return 0;
    }

    subin.push(N);
    loc[N] = 0;

    while ( !subin.empty() ) {
        int cur = subin.front();
        subin.pop();

        jump(cur);

        for ( int now : {cur-1, cur+1} ) {
            if ( now < 0 || now > 100000 ) continue;
            if ( loc[now] != -1 ) continue;

            loc[now] = loc[cur]+1;
            subin.push(now);
            jump(now);
        }
    }

    cout << loc[K];
}
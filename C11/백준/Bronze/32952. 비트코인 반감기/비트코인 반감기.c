#include <stdio.h>

int main() {
    long long R,K,M;
    scanf("%lld %lld %lld", &R, &K, &M);
    M /= K;
    
    for ( int i = 0 ; i < M ; i++ )
        R /= 2;
    printf("%lld",R);
}
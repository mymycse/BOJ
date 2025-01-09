#include <cstdio>

int main() {
    int T;
    scanf("%d",&T);

    for ( int i = 0 ; i < T ; i++ ) {
        int n;
        scanf("%d",&n);
        for ( int j = 0 ; j < n/5 ; j++ )
            printf("++++ ");
        for ( int j = 0 ; j < n%5 ; j++ )
            printf("|");
        printf("\n");
    }
}
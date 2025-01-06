#include <stdio.h>

int main() {
    int M,P,L,E,R,S,N;
    while ( scanf("%d %d %d %d %d %d %d",&M,&P,&L,&E,&R,&S,&N) == 7 ) {
        int result = 0;
        for ( int i = 1 ; i <= N ; i++ ) {
            int tempL = M*E;
            int tempP = L/R;
            int tempM = P/S;
            L = tempL;  P = tempP; M = tempM;
        }

        printf("%d\n",M);
    }
}
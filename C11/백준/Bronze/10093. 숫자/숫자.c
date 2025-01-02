#include <stdio.h>

int main() {
    long int A,B;
    scanf("%ld %ld", &A, &B);
    if ( A == B ) {
        printf("0");
        return 0;
    }

    if ( A > B ) {
        long int temp = A;
        A = B;
        B = temp;
    }
    
    printf("%ld\n",B-A-1);
    for ( long int i = A+1 ; i < B ; i++ )
        printf("%ld ",i);
}
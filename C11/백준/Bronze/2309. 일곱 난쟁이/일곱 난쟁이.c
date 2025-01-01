#include <stdio.h>
#include <stdlib.h>

int compare(const int* a, const int* b) {
    return (*a - *b);
}
int main() {
    int arr[9];
    int sum = 0;
    for ( int i = 0 ; i < 9 ; i++ ) {
        scanf("%d",&arr[i]);
        sum += arr[i];
    }

    qsort(arr,9,sizeof(int),compare);

    int goal = sum - 100;
    int st = 0;
    int en = 8;
    
    while ( st < en ) {
        int temp = arr[st]+arr[en];
        if ( temp == goal )
            break;
        else if ( temp < goal )
            st++;
        else
            en--;
    }

    for ( int i = 0 ; i < 9 ; i++ ) {
        if ( i == st || i == en )
            continue;
        printf("%d\n", arr[i]);
    }
}
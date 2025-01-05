#include <stdio.h>
#include <string.h>

int main() {
    char s[1000001];
    char p[1000001];
    scanf("%s %s",&s,&p);
    if ( strstr(s,p) != NULL )
        printf("1");
    else
        printf("0");
}
#include <stdio.h>

int a, b, c;

int main(){

    scanf("%d %d %d", &a, &b, &c);

    if ((a >= 1 && a <= 1000) && (b >= 1 && b <= 1000) && (c >= 1 && c <= 1000)){
        if(a+b>c&&b+c>a&&c+a>b){
            if(a!=b&&b!=c&&c!=a)
                printf("3");
            else if(a==b&&b==c&&c==a)
                printf("1");
            else
                printf("2");
        } else printf("-1");
    }
    else
        printf("-1");
    return 0;

}

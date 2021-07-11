#include <stdio.h>

void getVal();
int a, b, c;

int main()
{

    getVal();

    // if ((a>=0 && a<=180) && (b>=0 && b<=180) && (c>=0 && c<=180)){
    if(a>0&&b>0&&c>0){
        if(a+b+c==180)
            printf("YES");
        else
            printf("NO");
    }
    else
        printf("NO");
    return 0;
}

void getVal(){
    scanf("%d %d %d", &a, &b, &c);
}
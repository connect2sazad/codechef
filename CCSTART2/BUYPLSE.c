#include<stdio.h>

void getVal();
int a, b, x, y;

int main(){

    getVal();

    if((a>=1 && a<=1000) && (b>=1 && b<=1000) && (x>=1 && x<=1000) && (y>=1 && y<=1000)){
        int total = a*x+b*y;
        printf("%d", total);
    } else getVal();
    return 0;
}

void getVal(){
    scanf("%d %d %d %d", &a, &b, &x, &y);
}

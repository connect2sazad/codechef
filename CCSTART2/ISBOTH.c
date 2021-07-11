#include<stdio.h>

void getVal();
int N;

int main(){

    getVal();

    if(N>=1 && N<=1000){
        if(N%5==0 && N%11==0)
            printf("BOTH");
        else if(N%5==0 || N%11==0)
            printf("ONE");
        else
            printf("NONE");
    } else getVal();
    return 0;
}

void getVal(){
    scanf("%d", &N);
}

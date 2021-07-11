#include<stdio.h>

void getVal();
long int N;

int main(){

    int count=0;

    getVal();

    if(N>=1 && N<=1000000){
        for (long int i = 1; i <= N; i++){
            if(N%i==0)
                count++;
        }
        printf("%d\n", count);
        for (long int i = 1; i <= N; i++){
            if(N%i==0)
                printf("%d ", i);
        }
        
    } else getVal();
    return 0;
}

void getVal(){
    scanf("%ld", &N);
}

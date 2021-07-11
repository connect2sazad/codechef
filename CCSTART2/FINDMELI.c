#include <stdio.h>

int main(){

    int N, K, flag;
    scanf("%d %d", &N, &K);

    int A[N];
    for (int i = 0; i < N; i++){
        scanf("%d", &A[i]);
    }

    for (int i = 0; i < N; i++){
        if(K==A[i]){
            flag = 1;
            break;
        } else{
            flag = -1;
        }
    }

    printf("%d", flag);
    
    return 0;
}

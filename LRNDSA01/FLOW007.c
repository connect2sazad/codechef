#include <stdio.h>

long int reverseNum(long int num);
int T;

int main() {
	
	scanf("%d", &T);
	long int TESTCASES[T];

	for (int i = 0; i < T; i++){
		scanf("%ld", &TESTCASES[i]);
	}
	
	for (int i = 0; i < T; i++){
		printf("%ld\n", reverseNum(TESTCASES[i]));
	}

	return 0;
}


long int reverseNum(long int num){
	long int reverse = 0;
	while (num!=0){
		reverse = reverse * 10 + (num % 10);
		num /= 10;
	}
	return reverse;
}

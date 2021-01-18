#include <stdio.h>

int main(void){
	int T,N,prime;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>20){
			printf("T must be 1 <= T <= 20\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>100000){
				printf("N must be 1 <= N <= 100000\n");
			}else{
				break;
			}
		}

		prime = 0;

		for(int i=1;i<=N/2;i++){
			if(N%i==0){
				prime++;
			}
		}

		if(prime==1){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}

	return 0;
}
#include <stdio.h>

int main(void){
	int T,N,count;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>1000000){
				printf("N must be 1 <= N <= 1000000\n");
			}else{
				break;
			}
		}

		count = 0;

		count += N/100;
		N %= 100;
		count += N/50;
		N %= 50;
		count += N/10;
		N %= 10;
		count += N/5;
		N %= 5;
		count += N/2;
		N %= 2;
		count += N/1;

		printf("%d\n",count);

		T--;
	}

	return 0;
}
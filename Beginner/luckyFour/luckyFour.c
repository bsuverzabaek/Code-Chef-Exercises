#include <stdio.h>

int main(void){
	int T,N,count;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100000){
			printf("T must be 1 <= T <= 10^5\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<0 || N>1000000000){
				printf("N must be 0 <= N <= 10^9\n");
			}else{
				break;
			}
		}

		count = 0;

		while(N>0){
			if(N%10==4){
				count++;
			}

			N /= 10;
		}

		printf("%d\n",count);

		T--;
	}

	return 0;
}
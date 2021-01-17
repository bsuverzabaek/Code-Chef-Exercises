#include <stdio.h>

int main(void){
	int T,N;

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

			if(N<-20 || N>20){
				printf("N must be -20 <= N <= 20\n");
			}else{
				break;
			}
		}

		if(N<10){
			printf("Thanks for helping Chef!\n");
		}else{
			printf("-1\n");
		}

		T--;
	}

	return 0;
}
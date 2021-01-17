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

			if(N<=1 || N>100000000){
				printf("N must be 2 <= N <= 10^8\n");
			}else{
				break;
			}
		}

		printf("%d\n",(N/2)+1);

		T--;
	}

	return 0;
}
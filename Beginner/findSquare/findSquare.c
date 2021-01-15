#include <stdio.h>
#include <math.h>

int main(void){
	int T,N;

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

			if(N<=0 || N>10000){
				printf("N must be 1 <= N <= 10000\n");
			}else{
				break;
			}
		}

		printf("%.0f\n",floor(sqrt(N)));

		T--;
	}

	return 0;
}
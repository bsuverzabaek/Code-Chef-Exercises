#include <stdio.h>

int main(void){
	int T;
	int N;
	int sum;
	int m;

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

		sum = 0;

		while(N>0){
			m = N%10;
			sum += m;
			N /= 10;
		}

		printf("%d\n",sum);

		T--;
	}

	return 0;
}
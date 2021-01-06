#include <stdio.h>
#include <math.h>

int main(void){
	int T;
	int i;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100000){
			printf("T must be 1 <= T <= 100000\n");
		}else{
			break;
		}
	}

	while(T>0){
		int N;

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>1000000000){
				printf("N must be 1 <= N <= 10^9\n");
			}else{
				break;
			}
		}
		
		int count = 0;
		i = 1;

		while(1){
			if(N/pow(5,i)<1){
				break;
			}else{
				count += N/pow(5,i);
			}

			i++;
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
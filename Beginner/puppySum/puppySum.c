#include <stdio.h>

int main(void){
	int T,D,N,sum;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>16){
			printf("T must be 1 <= T <= 16\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d",&D,&N);

			if(D<=0 || D>4 || N<=0 || N>4){
				printf("D and N must be 1 <= D,N <= 4\n");
			}else{
				break;
			}
		}

		sum = N;

		while(D>=1){
			sum = sum*(sum+1)/2;
			D--;
		}

		printf("%d\n",sum);

		T--;
	}
	
	return 0;
}
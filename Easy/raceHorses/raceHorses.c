#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T;
	int N;
	int min;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>10){
			printf("T must be 1 <= T <= 10\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=1 || N>5000){
				printf("N must be 2 <= N <= 5000\n");
			}else{
				break;
			}
		}

		int S[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&S[i]);

				if(S[i]<=0 || S[i]>1000000000){
					printf("S[%d] must be 1 <= S[i] <= 10^9\n",i);
				}else{
					break;
				}
			}
		}

		qsort(S,N,sizeof(int),compare);

		min = 1000000000;

		for(int i=1;i<N;i++){
			if(S[i]-S[i-1]<min){
				min = S[i] - S[i-1];
			}
		}

		printf("%d\n",min);

		T--;
	}

	return 0;
}
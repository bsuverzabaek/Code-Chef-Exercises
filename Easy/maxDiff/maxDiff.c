#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,K,sum,S1,S2;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100){
			printf("T must be 1 <= T <= 100\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d",&N,&K);

			if(K<=0 || K>=N){
				printf("K must be 1 <= K < N\n");
			}else if(N<=K || N>100){
				printf("N must be K < N <= 100\n");
			}else{
				break;
			}
		}

		int W[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&W[i]);

				if(W[i]<=0 || W[i]>100000){
					printf("W[%d] must be 1 <= W[i] <= 10^5\n",i);
				}else{
					break;
				}
			}
		}

		qsort(W,N,sizeof(int),compare);

		sum = 0;
		S1 = 0;
		S2 = 0;

		for(int i=0;i<N;i++){
			sum += W[i];
		}

		for(int i=0;i<K;i++){
			S1 += W[i];
		}

		for(int i=N-1;i>=N-K;i--){
			S2 += W[i];
		}

		printf("%d\n",max(abs(S1-(sum-S1)),abs(S2-(sum-S2))));

		T--;
	}

	return 0;
}
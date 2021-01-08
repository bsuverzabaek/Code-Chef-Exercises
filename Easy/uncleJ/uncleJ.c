#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T;
	int N;
	int K;
	int temp;

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

			if(N>100 || N<=0){
				printf("N must be 1 <= N <= 100\n");
			}else{
				break;
			}
		}

		int A[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&A[i]);

				if(A[i]<=0 || A[i]>1000000000){
					printf("A[%d] must be 1 <= A[i] <= 10^9\n",i);
				}else{
					break;
				}
			}
		}

		while(1){
			scanf("%d",&K);

			if(K<=0 || K>N){
				printf("K must be 1 <= K <= N\n");
			}else{
				break;
			}
		}

		for(int i=0;i<N;i++){
			if(K==i+1){
				temp = A[i];
			}
		}

		qsort(A,N,sizeof(int),compare);

		for(int i=0;i<N;i++){
			if(A[i]==temp){
				printf("%d\n",i+1);
			}
		}

		T--;
	}

	return 0;
}
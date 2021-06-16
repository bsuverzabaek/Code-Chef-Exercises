#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,K,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=10000);
		assert(2*K>=0 && 2*K<N);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=-1000000 && A[i]<=1000000);
		}

		qsort(A,N,sizeof(int),compare);
		sum = 0;

		for(int i=K;i<N-K;i++){
			sum += A[i];
		}

		printf("%lf\n",sum/(N-K*2.0));

		T--;
	}
	
	return 0;
}
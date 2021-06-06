#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,sum1,sum2;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100);

		int A[N];
		int B[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&B[i]);
			assert(B[i]>=1 && B[i]<=1000);
		}

		qsort(A,N,sizeof(int),compare);
		qsort(B,N,sizeof(int),compare);

		A[N-1] = 0;
		B[N-1] = 0;

		sum1 = 0;
		sum2 = 0;

		for(int i=0;i<N;i++){
			sum1 += A[i];
			sum2 += B[i];
		}

		if(sum1==sum2){
			printf("Draw\n");
		}else if(sum2<sum1){
			printf("Bob\n");
		}else{
			printf("Alice\n");
		}

		T--;
	}
	
	return 0;
}
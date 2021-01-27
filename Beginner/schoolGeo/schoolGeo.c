#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=10000);

		int A[N];
		int B[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&B[i]);
			assert(B[i]>=1 && B[i]<=1000000000);
		}

		qsort(A,N,sizeof(int),compare);
		qsort(B,N,sizeof(int),compare);

		sum = 0;

		for(int i=0;i<N;i++){
			sum += min(A[i],B[i]);
		}

		printf("%d\n",sum);

		T--;
	}

	return 0;
}
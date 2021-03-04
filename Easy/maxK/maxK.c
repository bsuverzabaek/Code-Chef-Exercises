#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

long long int min(long long int a,long long int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int compare(const void *a,const void *b){
	if(*(long long int*)b-*(long long int*)a<0){
		return -1;
	}

	if(*(long long int*)b-*(long long int*)a>0){
		return 1;
	}

	return 0;
}

int main(void){
	long long int N,K,sum,size;

	scanf("%lld %lld",&N,&K);
	
	assert(N>=1 && N<=100000);
	assert(K>=1 && K<=min(N*(N+1)/2,100000));

	long long int A[N];
	long long int ans[N*(N+1)/2];

	for(long long int i=0;i<N;i++){
		scanf("%lld",&A[i]);
		assert(A[i]>=1 && A[i]<=1000000000);
	}

	size = 0;

	for(long long int i=0;i<N;i++){
		sum = 0;

		for(long long int j=i;j<N;j++){
			sum += A[j];
			ans[size] = sum;
			size++;
		}
	}

	qsort(ans,N*(N+1)/2,sizeof(long long int),compare);

	for(long long int i=0;i<K;i++){
		printf("%lld ",ans[i]);
	}

	printf("\n");
	
	return 0;
}
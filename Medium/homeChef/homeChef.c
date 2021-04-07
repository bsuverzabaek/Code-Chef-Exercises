#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	long long int x = ((long long int *)a)-((long long int *)b);

	if(x!=0){
		return x;
	}

	return ((long long int *)a)-((long long int *)b);
}

int main(void){
	int T,N;
	long long int a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N<=1000);

		long long int X[N];
		long long int Y[N];

		for(int i=0;i<N;i++){
			scanf("%lld %lld",&X[i],&Y[i]);
			assert(X[i]>=-100000000 && X[i]<=100000000);
			assert(Y[i]>=-100000000 && Y[i]<=100000000);
		}

		if(N%2!=0){
			printf("1\n");
		}else{
			qsort(X,N,sizeof(long long int),compare);
			qsort(Y,N,sizeof(long long int),compare);

			a = X[N/2]-X[N/2-1]+1;
			b = Y[N/2]-Y[N/2-1]+1;

			printf("%lld\n",a*b);
		}

		T--;
	}
	
	return 0;
}
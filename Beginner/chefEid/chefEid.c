#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,sumN,min;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100000);

		sumN += N;

		if(T==1){
			assert(sumN<=500000);
		}

		int v[N];

		for(int i=0;i<N;i++){
			scanf("%d",&v[i]);
			assert(v[i]>=1 && v[i]<=1000000);
		}

		qsort(v,N,sizeof(int),compare);
		min = 10000000;

		for(int i=0;i<N-1;i++){
			if(v[i+1]-v[i]<=min){
				min = v[i+1]-v[i];
			}
		}

		printf("%d\n",min);

		T--;
	}
	
	return 0;
}
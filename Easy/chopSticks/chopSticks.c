#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a - *(int*)b;
}

int main(void){
	int N,D,count;

	scanf("%d %d",&N,&D);

	assert(N>=1 && N<=100000);
	assert(D>=0 && D<=1000000000);

	int L[N];

	for(int i=0;i<N;i++){
		scanf("%d",&L[i]);
		assert(L[i]>=1 && L[i]<=1000000000);
	}

	qsort(L,N,sizeof(int),compare);
	count = 0;

	for(int i=0;i<N-1;i++){
		if((L[i+1]-L[i])<=D){
			count++;
			i++;
		}
	}

	printf("%d\n",count);
	
	return 0;
}
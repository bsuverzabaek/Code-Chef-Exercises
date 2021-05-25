#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return (*(int*)a - *(int*)b);
}

int main(void){
	int N,K,next,counter;

	scanf("%d %d",&N,&K);
	assert(N>=1 && N<=1000000);

	int numberCount[N];

	for(int i=0;i<N;i++){
		scanf("%d",&numberCount[i]);
		assert(numberCount[i]>=1 && numberCount[i]<=10000000);
	}

	qsort(numberCount,N,sizeof(int),compare);
	next = numberCount[0];
	counter = 1;

	for(int i=1;i<N;i++){
		if((numberCount[i]-next)>=K){
			counter++;
			next = numberCount[i];
		}
	}

	printf("%d\n",counter);

	return 0;
}
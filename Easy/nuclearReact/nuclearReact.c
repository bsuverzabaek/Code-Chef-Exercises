#include <stdio.h>
#include <assert.h>

int main(void){
	int A,N,K;
	scanf("%d %d %d",&A,&N,&K);

	assert(A>=0 && A<=1000000000);
	assert(N>=0 && N<=100);
	assert(K>=0 && K<=100);

	for(int i=0;i<K;i++){
		printf("%d ",A%(N+1));
		A /= (N+1);
	}

	printf("\n");
	
	return 0;
}
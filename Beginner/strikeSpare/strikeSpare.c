#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		printf("1 1");

		for(int i=0;i<N/2;i++){
			printf("0");
		}

		printf("\n");

		T--;
	}

	return 0;
}
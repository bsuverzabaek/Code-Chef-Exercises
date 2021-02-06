#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=10000);

		if(360%N==0){
			printf("y ");
		}else{
			printf("n ");
		}

		if(N<=360){
			printf("y ");
		}else{
			printf("n ");
		}

		if(N*(N+1)/2<=360){
			printf("y\n");
		}else{
			printf("n\n");
		}

		T--;
	}

	return 0;
}
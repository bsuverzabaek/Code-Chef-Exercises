#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=1000);
		assert(M>=1 && M<=1000);

		printf("%d\n",N*(M-1)+M*(N-1));

		T--;
	}
	
	return 0;
}
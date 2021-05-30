#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M;

	scanf("%d",&T);
	assert(T>=1 && T<=64);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=8);
		assert(M>=1 && M<=8);

		printf("%d\n",(N-1)*(M-1));

		T--;
	}
	
	return 0;
}
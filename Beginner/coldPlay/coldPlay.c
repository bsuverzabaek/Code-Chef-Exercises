#include <stdio.h>
#include <assert.h>

int main(void){
	int T,M,S;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&M,&S);

		assert(M>=1 && M<=100);
		assert(S>=1 && S<=10);

		printf("%d\n",M/S);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,X,Y,K,a;

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%d %d %d",&X,&Y,&K);

		assert(X>=0 && X<=1000000000);
		assert(Y>=0 && Y<=1000000000);
		assert(K>=1 && K<=1000000000);

		a = (X+Y)/K;

		if(a%2==0){
			printf("Chef\n");
		}else{
			printf("Paja\n");
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,P1,P2,K,a;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d %d",&P1,&P2,&K);

		assert(P1>=0 && P1<=1000000000);
		assert(P2>=0 && P2<=1000000000);
		assert(K>=1 && K<=1000000000);

		a = (P1+P2)/K;

		if(a%2==0){
			printf("CHEF\n");
		}else{
			printf("COOK\n");
		}

		T--;
	}
	
	return 0;
}
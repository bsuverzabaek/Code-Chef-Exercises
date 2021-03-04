#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int N,M,K,rem;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld %lld %lld",&N,&M,&K);

		assert(N>=2 && N<=1000000000);
		assert(M>=2 && M<=1000000000);
		assert(K>=2 && K<=1000000000);

		if(M>N){
			printf("-1\n");
		}else{
			rem = N%M;

			if(rem%K==0){
				printf("%lld\n",rem/K);
			}else{
				printf("-1\n");
			}
		}

		T--;
	}
	
	return 0;
}
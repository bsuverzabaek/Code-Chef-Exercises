#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int N,K;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%lld %lld",&N,&K);
		assert(N>=0 && N<=8589934591);
		assert(K>=0 && K<=8589934591);

		if(K==0){
			printf("%d %lld\n",0,N);
		}else{
			printf("%lld %lld\n",N/K,N%K);
		}

		T--;
	}

	return 0;
}
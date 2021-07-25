#include <stdio.h>
#include <assert.h>

int main(void){
	int T,A,B;
	long long int K,N,count;

	scanf("%d",&T);
	assert(T>=1 && T<=15);

	while(T>0){
		scanf("%lld %d %d %lld",&N,&A,&B,&K);

		assert(K>=1 && K<=N);
		assert(N<=1000000000000000000);
		assert(A>=1 && A<=1000000000);
		assert(B>=1 && B<=1000000000);

		if(A%B==0){
			count = N/B-N/A;
		}else if(B%A==0){
			count = N/A-N/B;
		}else{
			count = N/A+N/B-2*(N/(A*B));
		}

		if(count>=K){
			printf("Win\n");
		}else{
			printf("Lose\n");
		}

		T--;
	}
	
	return 0;
}
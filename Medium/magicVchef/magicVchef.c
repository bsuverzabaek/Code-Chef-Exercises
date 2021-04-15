#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int N,K;
	double prob;

	scanf("%d",&T);
	assert(T>=1 && T<=200000);

	while(T>0){
		scanf("%lld %lld",&N,&K);

		assert(N>=1 && N<=1000000000000000000);
		assert(K>=0 && K<=1000000000);

		if(K>=0 && N>2){
			if(K==1 && (N&3)==2){
				N = (N>>1)+1;
			}else{
				while(K>0 && N>1){
					N = (N+1)>>1;
					K--;
				}
			}
		}

		prob = 1.0/(double) N;
		printf("%.8lf\n",prob);

		T--;
	}
	
	return 0;
}
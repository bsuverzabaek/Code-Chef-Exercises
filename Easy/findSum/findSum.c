#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int N,Q,p,q,sumN,sumQ,x;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	sumN = 0;
	sumQ = 0;

	while(T>0){
		scanf("%lld %lld",&N,&Q);

		assert(N>=2 && N<=100000);
		assert(Q>=1 && Q<=100000);

		sumN += N;
		sumQ += Q;

		if(T==1){
			assert(sumN<=500000);
			assert(sumQ<=500000);
		}

		long long int B[N+1];
		B[1] = 0;

		for(long long int i=1;i<N;i++){
			scanf("%lld",&x);
			assert(x>=1 && x<=1000000000);
			B[i+1] = x-B[i];
		}

		while(Q>0){
			scanf("%lld %lld",&p,&q);
			assert(p>=1 && p<=N && q>=1 && q<=N);

			if((p%2==1 && q%2==0) || (p%2==0 && q%2==1)){
				printf("%lld\n",B[p]+B[q]);
			}else{
				printf("UNKNOWN\n");
			}

			Q--;
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#define mod 1000000007

int main(void){
	int T,N;
	long P;
	long long Q,R,S;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		scanf("%ld",&P);
		assert(P>=1 && P<=1000000000);

		Q = 2 * P;
		R = 0;
		S = 2;

		for(int i=1;i<=N;i++){
			scanf("%ld",&P);
			assert(P>=1 && P<=1000000000);
			
			R *= 2;
			R += Q*P;
			R %= mod;

			Q += S*P;
			Q %= mod;

			S *= 2;
			S %= mod;
		}

		printf("%lld\n",R);

		T--;
	}

	return 0;
}
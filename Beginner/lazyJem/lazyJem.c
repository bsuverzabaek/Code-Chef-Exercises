#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long int N,B,M,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%ld %ld %ld",&N,&B,&M);
		assert(N>=1 && N<=100000000);
		assert(B>=1 && B<=100000000);
		assert(M>=1 && M<=100000000);

		ans = 0;

		while(N>0){
			long int prob = (N+1)/2;
			ans += prob * M;
			N -= prob;

			if(N){
				ans += B;
			}

			M *= 2;
		}

		printf("%ld\n",ans);

		T--;
	}

	return 0;
}
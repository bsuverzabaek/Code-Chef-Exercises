#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,sum,r,q;
	long long int ans,mod=1e9+7;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=1000000000);
		assert(K>=1 && K<=10000);

		sum = (K*(K+1))/2;
		int A[K];
		ans = 1;

		if(N<sum){
			ans = -1;
		}else if(N==sum){
			ans = 0;
		}else{
			r = N-sum;
			q = r/K;

			for(int i=1;i<=K;i++){
				A[i-1] = i;
			}

			for(int i=0;i<K;i++){
				A[i] += q;
			}

			r -= q*K;
			int j = K-1;

			while(r!=0){
				A[j--]++;
				r--;
			}

			for(int i=0;i<K;i++){
				ans = (((ans*(A[i]-1))%mod)*A[i])%mod;
			}
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
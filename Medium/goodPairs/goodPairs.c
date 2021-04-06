#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sumN,ans;
	
	scanf("%d",&T);
	assert(T>=1 && T<=20);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000000);

		sumN += N;

		if(T==1){
			assert(sumN>=1 && sumN<=1000000);
		}

		int count[1000001] = {0};
		int dp[1000001] = {0};
		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=0 && A[i]<=1000000);
			dp[A[i]]++;
			count[A[i]]++;
		}

		for(int i=0;i<21;i++){
			for(int j=1;j<1000001;j++){
				if(j&(1<<i)){
					dp[j] += dp[j^(1<<i)];
				}
			}
		}

		ans = 0;

		for(int i=0;i<N;i++){
			ans += count[A[i]]*(dp[A[i]]-count[A[i]])+count[A[i]]*(count[A[i]]-1)/2;
			count[A[i]] = 0;
		}

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
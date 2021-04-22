#include <stdio.h>
#include <assert.h>

int main(void){
	int T,sumN;
	long long int N,prev,temp,ans,ones,p;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	sumN = 0;

	while(T>0){
		scanf("%lld",&N);
		assert(N>=1 && N<=100000);

		sumN += N;

		if(T==1){
			assert(sumN<=100000);
		}

		long long int A[N];
		prev = 0;

		for(int i=0;i<N;i++){
			scanf("%lld",&temp);
			assert(temp>=0 && temp<=1000000000);
			A[i] = prev^temp;
			prev = A[i];
		}

		ans = 0;

		for(int i=0;i<32;i++){
			p = 1;
			p <<= i;
			ones = 0;

			for(int j=0;j<N;j++){
				if((p&A[j])!=0){
					ones++;
				}
			}

			ans += (ones)*(N+1-ones)*p;
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
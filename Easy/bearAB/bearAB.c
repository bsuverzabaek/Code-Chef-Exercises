#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,countA,countB;
	long long int ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&K);
		
		assert(N>=1 && N<=100000);
		assert(N*K>=1 && N*K<=1000000000);

		char S[N];
		scanf("%s",S);

		countA = 0;
		countB = 0;
		ans = 0;

		for(int i=0;i<N;i++){
			if(S[i]=='a'){
				countA++;
			}

			if(S[i]=='b'){
				countB++;
				ans += countA;
			}
		}

		ans *= K;
		ans += (long long)countA*countB*K*(K-1)/2;
		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
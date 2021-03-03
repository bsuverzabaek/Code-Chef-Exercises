#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long N,ans,x;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%ld",&N);
		assert(N>=1 && N<=100000);

		long A[1000002] = {0};
		long C[2] = {0};

		ans = 0;

		for(long i=0;i<N;i++){
			scanf("%ld",&x);
			assert(x>=1 && x<=1000000);

			if(x%2==0){
				ans += C[0];
			}else{
				ans += C[1];
			}

			ans -= A[x];
			ans -= A[x^2];
			C[x%2]++;
			A[x]++;
		}

		printf("%ld\n",ans);

		T--;
	}
	
	return 0;
}
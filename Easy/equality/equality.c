#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sumN;
	long long int sum;

	scanf("%d",&T);
	assert(T>=1 && T<=25000);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=50000);
		sumN += N;

		if(T==1){
			assert(sumN<=50000);
		}

		long long int a[N];
		sum = 0;

		for(int i=0;i<N;i++){
			scanf("%lld",&a[i]);
			assert(a[i]>=1 && a[i]<=5000000000000);
			sum += a[i];
		}

		sum /= N-1;

		for(int i=0;i<N;i++){
			assert(sum-a[i]>=1 && sum-a[i]<=100000000);
			printf("%lld ",sum-a[i]);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
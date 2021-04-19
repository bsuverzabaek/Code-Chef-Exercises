#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;
	long long int sum,prefSum;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		long long int a[N];

		for(int i=0;i<N;i++){
			scanf("%lld",&a[i]);
			assert(a[i]>=1 && a[i]<1073741824);
		}

		sum = 0;
		prefSum = 0;

		for(int i=0;i<N;i++){
			prefSum += a[i];
			sum = (sum|a[i])|prefSum;
		}

		printf("%lld\n",sum);

		T--;
	}
	
	return 0;
}
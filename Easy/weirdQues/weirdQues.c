#include <stdio.h>
#include <assert.h>

int main(void){
	int T,sumN;
	long long int N,x,count;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	sumN = 0;

	while(T>0){
		scanf("%lld",&N);
		assert(N>=2 && N<=1000000);
		sumN += N;

		if(T==1){
			assert(sumN<=3000000);
		}

		long long int A[N];

		for(long long int i=1;i<=N;i++){
			A[i] = 0;
		}

		for(long long int i=1;i<=N;i++){
			scanf("%lld",&x);
			assert(x>=1 && x<=1000000);
			A[x]++;
		}

		count = 0;

		for(long long int i=1;i<=N;i++){
			for(long long int j=1;j<=N;j++){
				if(A[i]<j){
					break;
				}else{
					if(A[j]>=i){
						count++;
					}else{
						continue;
					}
				}
			}
		}

		printf("%lld\n",count);

		T--;
	}
	
	return 0;
}
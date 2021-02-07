#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,sum,sumN,count;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d",&N,&K);
		sumN = 0;

		assert(N>=1 && N<=100000);
		assert(K>=1 && K<=1000000000);

		int A[N];
		sum = 0;
		sumN += N;
		count = 0;

		if(T==1){
			assert(sumN>=1 && sumN<=100000);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=10000);
			sum += A[i];
		}

		for(int i=0;i<N;i++){
			sum -= A[i];

			if(A[i]+K>sum){
				count++;
				sum += A[i];
			}else{
				sum += A[i];
			}
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
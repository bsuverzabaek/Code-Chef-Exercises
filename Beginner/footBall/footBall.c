#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sum,max;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=150);

		int A[N];
		int B[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=0 && A[i]<=50);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&B[i]);
			assert(B[i]>=0 && B[i]<=50);
		}

		sum = 0;
		max = 0;

		for(int i=0;i<N;i++){
			sum = (A[i]*20-B[i]*10);

			if(max<sum){
				max = sum;
			}
		}

		printf("%d\n",max);

		T--;
	}
	
	return 0;
}
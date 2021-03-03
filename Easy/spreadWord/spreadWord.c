#include <stdio.h>
#include <assert.h>

int main(void){
	int T,sumN;
	long int N,sum,a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	sumN = 0;

	while(T>0){
		scanf("%ld",&N);
		assert(N>=2 && N<=100000);
		sumN += N;

		if(T==1){
			assert(sumN<=1000000);
		}

		long int A[N];
		long int B[N];
		long int C[N];

		sum = 0;

		for(long int i=0;i<N;i++){
			scanf("%ld",&A[i]);
			assert(A[i]>=0 && A[i]<=N);
			sum += A[i];
			B[i] = sum;
		}

		assert(A[0]>=1);

		a = 0;
		b = 0;
		C[0] = B[0];

		while(C[a]<=N-b-1){
			b += B[b];
			C[a+1] = B[b];
			a++;
		}

		if(b<N-1){
			a++;
		}

		printf("%ld\n",a);

		T--;
	}
	
	return 0;
}
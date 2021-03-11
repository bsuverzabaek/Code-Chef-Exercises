#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int N,M,sumN,sumM,count,max;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	sumN = 0;
	sumM = 0;

	while(T>0){
		scanf("%lld %lld",&N,&M);

		assert(N>=1 && N<=100000);
		assert(M>=1 && M<=100000);

		sumN += N;
		sumM += M;

		if(T==1){
			assert(sumN<=500000);
			assert(sumM<=500000);
		}

		long long int H[N];
		long long int C[N];
		long long int F[M+1];

		for(long long int i=0;i<N;i++){
			scanf("%lld",&H[i]);
			assert(H[i]>=1 && H[i]<=1000000000);
		}

		for(long long int i=0;i<N;i++){
			scanf("%lld",&C[i]);
			assert(C[i]>=1 && C[i]<=M);
		}

		for(long long int i=0;i<M+1;i++){
			F[i] = 0;
		}

		count = 0;
		max = H[N-1];
		F[C[N-1]]++;

		for(long long int i=N-1;i>=1;i--){
			if(H[i-1]>max){
				max = H[i-1];
				F[C[i-1]]++;
			}
		}

		for(long long int i=0;i<M+1;i++){
			if(F[i]>0){
				count++;
			}
		}

		printf("%lld\n",count);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

long long int min(long long int a,long long int b){
	return (a<b?a:b);
}

long long int max(long long int a,long long int b){
	return (a>b?a:b);
}

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=10);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=-9 && A[i]<=9);
		}

		long long int sol1[N];
		long long int sol2[N];

		sol1[0] = A[0];
		sol2[0] = A[0];

		for(int i=1;i<N;i++){
			if(A[i]<0){
				sol1[i] = min(sol1[i-1]+A[i],sol2[i-1]*A[i]);
				sol2[i] = max(sol2[i-1]-A[i],sol1[i-1]*A[i]);
			}else{
				sol1[i] = min(sol1[i-1]-A[i],sol1[i-1]*A[i]);
				sol2[i] = max(sol2[i-1]+A[i],sol2[i-1]*A[i]);
			}
		}

		printf("%lld\n",sol1[N-1]);

		T--;
	}
	
	return 0;
}
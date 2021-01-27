#include <stdio.h>
#include <assert.h>
#define mod 1000000007

int main(void){
	int N,K,s;

	scanf("%d %d",&N,&K);
	assert((N>=1 && N<=200000) && (K>=1 && K<=200000));

	if(N<=K){
		printf("1\n");
		return 0;
	}

	int A[N];
	s = 0;

	for(int i=0;i<K;i++){
		A[i] = 1;
		s += A[i];
		s %= mod;
	}

	for(int i=K;i<N;i++){
		s %= mod;
		A[i] = s;
		s += A[i];
		s -= A[i-K];
		s %= mod;
	}

	printf("%d\n",A[N-1]);

	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=100);
		assert(K>=1 && K<=100000);

		int A[N];
		sum = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=100000);
			sum += A[i];
		}

		if(sum%K==0){
			printf("0\n");
		}else{
			printf("1\n");
		}

		T--;
	}
	
	return 0;
}
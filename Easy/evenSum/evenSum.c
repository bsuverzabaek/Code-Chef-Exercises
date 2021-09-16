#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];
		sum = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
			sum += A[i];
		}

		if(sum%2==0){
			printf("1\n");
		}else{
			printf("2\n");
		}

		T--;
	}
	
	return 0;
}
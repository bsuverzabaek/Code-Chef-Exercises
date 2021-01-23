#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		int A[N];
		int B[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000);
			B[i] = 0;
		}

		for(int i=N-2;i>=0;i--){
			if(A[i]==A[i+1]){
				B[i] = B[i+1];
			}else{
				B[i] = N-1-i;
			}
		}

		for(int i=0;i<N;i++){
			printf("%d ",B[i]);
		}
		printf("\n");

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,x;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	for(int t=1;t<=T;t++){
		scanf("%d",&N);
		assert(N>=1 && N<=10000);

		int A[N];
		int B[N];

		for(int i=0;i<N;i++){
			scanf("%d",&x);
			A[i] = (x<<16)>>16;
			B[i] = (x-A[i])>>16;
		}

		printf("Case %d:\n",t);

		for(int i=0;i<N;i++){
			printf("%d ",A[i]);
		}

		printf("\n");

		for(int i=0;i<N;i++){
			printf("%d ",B[i]);
		}

		printf("\n");
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,sumN;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=2000000);
		sumN += N;

		if(T==1){
			assert(sumN<=2000000);
		}

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
		}

		for(int i=1;i<N;i++){
			A[i] = min(A[i],A[i-1]+1);
		}

		for(int i=N-2;i>=0;i--){
			A[i] = min(A[i],A[i+1]+1);
		}

		for(int i=0;i<N;i++){
			printf("%d ",A[i]);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
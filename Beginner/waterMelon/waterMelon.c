#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int main(void){
	int T,N,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=10);

		int A[N];
		sum = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(abs(A[i])<=100);

			sum += A[i];
		}

		if(sum>=0){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}

	return 0;
}
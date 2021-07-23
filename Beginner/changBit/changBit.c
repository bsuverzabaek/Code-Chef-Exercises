#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,d;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];
		d = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=0 && A[i]<=1000000000);
			d |= A[i];
		}

		printf("%d\n",d);

		T--;
	}
	
	return 0;
}
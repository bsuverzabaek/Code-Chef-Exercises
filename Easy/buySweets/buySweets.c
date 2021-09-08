#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,X,sum,f;

	scanf("%d",&T);
	assert(T>=1 && T<=20);

	while(T>0){
		scanf("%d %d",&N,&X);

		assert(N>=1 && N<=100);
		assert(X>=1 && X<=100);

		int A[N];
		sum = 0;
		f = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=100);
			sum += A[i];
		}

		for(int i=0;i<N;i++){
			if((sum-A[i])/X==sum/X){
				printf("-1\n");
				f = 1;
				break;
			}
		}

		if(f==0){
			printf("%d\n",sum/X);
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,X,c;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&X);

		assert(N>=1 && N<=1000);
		assert(X>=1 && X<=1000000);

		int A[N];
		c = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000);

			if(A[i]>=X){
				c++;
			}
		}

		if(c==0){
			printf("NO\n");
		}else{
			printf("YES\n");
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,x,c;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		int A[101] = {0};
		c = 0;

		for(int i=1;i<=N;i++){
			scanf("%d",&x);
			assert(x>=1 && x<=100);
			A[x]++;

			if(A[x]>c){
				c = A[x];
			}
		}

		printf("%d\n",N-c);

		T--;
	}

	return 0;
}
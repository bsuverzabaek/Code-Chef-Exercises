#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,ai,count;

	scanf("%d",&T);
	assert(T>=1 && T<=20);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[100000] = {0};
		count = 0;

		while(N>0){
			scanf("%d",&ai);
			assert(ai>=1 && ai<=100000);

			A[ai]++;

			if(A[ai]==1){
				count++;
			}

			N--;
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
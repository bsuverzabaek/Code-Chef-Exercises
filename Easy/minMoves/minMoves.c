#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,min,count;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		int W[N];
		min = 10000;
		count = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&W[i]);
			assert(W[i]>=0 && W[i]<=10000);

			if(W[i]<min){
				min = W[i];
			}

			count += W[i];
		}

		printf("%d\n",count-(N*min));

		T--;
	}

	return 0;
}
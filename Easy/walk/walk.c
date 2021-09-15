#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,max;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int W[N];
		max = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&W[i]);
			assert(W[i]>=1 && W[i]<=1000000);

			if(W[i]>max){
				max = W[i];
			}
		}

		for(int i=0;i<N;i++){
			if(i+W[i]>max){
				max = i+W[i];
			}
		}

		printf("%d\n",max);

		T--;
	}
	
	return 0;
}
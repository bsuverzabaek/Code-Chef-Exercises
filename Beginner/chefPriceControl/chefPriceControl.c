#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=10000);
		assert(K>=1 && K<=1000);

		int P[N];
		sum = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&P[i]);
			assert(P[i]>=1 && P[i]<=1000);

			if(P[i]>K){
				sum += P[i]-K;
			}
		}

		printf("%d\n",sum);
		
		T--;
	}
	
	return 0;
}
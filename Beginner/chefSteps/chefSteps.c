#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=1000);
		assert(K>=1 && K<=1000000000);

		int D[N];

		for(int i=0;i<N;i++){
			scanf("%d",&D[i]);
			assert(D[i]>=1 && D[i]<=1000000000);

			if(D[i]%K==0){
				printf("1");
			}else{
				printf("0");
			}
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
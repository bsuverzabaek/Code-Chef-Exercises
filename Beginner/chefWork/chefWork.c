#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,count,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=1000);
		assert(K>=1 && K<=1000);

		int W[N];
		sum = 0;
		count = 1;

		for(int i=0;i<N;i++){
			scanf("%d",&W[i]);
			assert(W[i]>=1 && W[i]<=1000);

			if(W[i]>K){
				count = -1;
				break;
			}else{
				if(sum+W[i]>K){
					count++;
					sum = W[i];
				}else{
					sum += W[i];
				}
			}
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
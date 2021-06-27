#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,a,count,rem;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=100000);
		assert(K>=1 && K<=1000000000);

		count = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&a);
			assert(a>=1 && a<=1000000000);

			if(a/K==0){
				count += (K-a);
			}else{
				rem = a%K;			
			}

			if(rem<=K/2){
				count += rem;
			}else{
				count += (K-rem);
			}
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
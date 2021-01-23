#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,N,K,V,num,sum;
	float x;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d %d",&N,&K,&V);
		
		assert(N>=1 && N<=100);
		assert(K>=1 && K<=100);
		assert(V>=1 && V<=100000);

		sum = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&num);
			sum += num;
		}

		x = (V*(N+K)-sum)/(float)K;

		if(x-ceil(x)==0 && x>0){
			printf("%0.0f\n",x);
		}else{
			printf("-1\n");
		}

		T--;
	}

	return 0;
}
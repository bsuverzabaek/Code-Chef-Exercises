#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,count,j;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000);

		count = 0;

		for(int i=1;i<=N;i+=2){
			j = N-i+1;
			count += (j*j);
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
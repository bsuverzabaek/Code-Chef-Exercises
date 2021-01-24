#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,max,i;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		max = -1;

		for(int j=0;j<N;j++){
			scanf("%d",&i);
			assert(i>=0 && i<=1000000000);

			if(i>max){
				max = i;
			}
		}

		printf("%d\n",max);

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,S,J,count;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		count = 0;

		while(N>0){
			scanf("%d %d",&S,&J);

			assert(S>=1 && S<=J);
			assert(J>=S && J<=300);

			if(J-S>5){
				count++;
			}

			N--;
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
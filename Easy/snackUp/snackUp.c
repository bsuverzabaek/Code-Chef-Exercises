#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,r1,r2,shift;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100);
		printf("%d\n",N);

		shift = 0;

		for(int i=0;i<N;i++){
			printf("%d\n",N);
			
			for(int j=0;j<N;j++){
				r1 = (j+shift)%N;
				r2 = (j+shift+1)%N;

				printf("%d %d %d\n",j+1,r1+1,r2+1);
			}
			shift += 2;
		}

		T--;
	}
	
	return 0;
}
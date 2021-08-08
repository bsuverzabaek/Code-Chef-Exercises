#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000000000);

		if(N%2==0){
			printf("%d %d\n",2,N/2);
		}else{
			printf("%d %d\n",1,N);
		}

		T--;
	}
	
	return 0;
}
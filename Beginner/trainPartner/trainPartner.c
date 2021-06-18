#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=500);

		if(N%8==1){
			printf("%dLB\n",N+3);
		}else if(N%8==4){
			printf("%dLB\n",N-3);
		}else if(N%8==2){
			printf("%dMB\n",N+3);
		}else if(N%8==5){
			printf("%dMB\n",N-3);
		}else if(N%8==3){
			printf("%dUB\n",N+3);
		}else if(N%8==6){
			printf("%dUB\n",N-3);
		}else if(N%8==7){
			printf("%dSU\n",N+1);
		}else if(N%8==0){
			printf("%dSL\n",N-1);
		}

		T--;
	}
	
	return 0;
}
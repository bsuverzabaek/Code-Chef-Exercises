#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,a,x;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=500);

		x = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&a);
			assert(a>=1 && a<=500);
			x ^= a;
		}

		if(x==0 || N%2==0){
			printf("First\n");
		}else{
			printf("Second\n");
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int N,M,q;

	scanf("%d %d",&N,&M);

	assert(N>=1 && N<=1000000000);
	assert(M>=1 && M<=100000);

	while(M>0){
		scanf("%d",&q);
		assert(q>=1 && q<=3*N);

		if(q>=(N+2) && q<=((2*N)+1)){
			printf("%d\n",q-N-1);
		}else if(q>=(2*(N+1)) && q<=(3*N)){
			printf("%d\n",(3*N)-q+1);
		}else{
			printf("0\n");
		}

		M--;
	}
	
	return 0;
}
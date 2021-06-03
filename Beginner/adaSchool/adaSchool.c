#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M;

	scanf("%d",&T);
	assert(T>=1 && T<=5000);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=2 && N<=50);
		assert(M>=2 && M<=50);

		if((N*M)%2==0){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}
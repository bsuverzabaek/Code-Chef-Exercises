#include <stdio.h>
#include <assert.h>

int main(void){
	int T,K,N,a,s;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<1000);
		assert(K>=1 && K<=1000000);

		s = 0;

		while(N>0){
			scanf("%d",&a);
			assert(a>=1 && a<=1000000000);

			s += a;

			N--;
		}

		if(s%2==0 && K==1){
			printf("odd\n");
		}else{
			printf("even\n");
		}

		T--;
	}
	
	return 0;
}
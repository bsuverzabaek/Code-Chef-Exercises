#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,i;
	long long int L,q;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d %lld",&N,&K,&L);

		assert(N>=1 && N<=1000);
		assert(K>=2 && K<=1000);
		assert(L>=1 && L<=1000000000000000000);

		int a[N];
		
		q = L-1;
		i = 0;

		while(q>0){
			a[i++] = q%K;
			q /= K;
		}

		while(i<N){
			a[i++] = 0;
		}

		for(i=N-1;i>=0;i--){
			printf("%d ",a[i]+1);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
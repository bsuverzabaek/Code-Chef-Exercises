#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int N,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){
		scanf("%lld",&N);
		assert(N>=1 && N<=10000);

		ans = 2*N*(N-1)*(N-1) + N*(N-1)*(N-2) + 2*N*(N-1)*(N-2)*(N-2);
		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long int N,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%ld",&N);
		assert(N>=1 && N<=100000);

		ans = 0;
		ans = N+(N*(N+1)/2);

		printf("%ld\n",ans);

		T--;
	}
	
	return 0;
}
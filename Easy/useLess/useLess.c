#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int main(void){
	int T;
	long long int P,Q,N,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld %lld %lld",&P,&Q,&N);

		assert((P/Q)>=-100 && (P/Q)<=100);
		assert((P/Q)!=1);
		assert(Q>=1 && Q<=10000);
		assert(N>=1 && N<=1000000);

		ans = ((N-1)*Q)/(2*llabs(P-Q))+1;
		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M;
	long long int ans,a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=1000000000);
		assert(M>=2 && M<=1000000000);

		a = N/M;
		b = N%M;

		ans = a*a*(M-1);
		ans += a*(a-1);

		if(M%2==0){
			ans -= a;
		}

		ans /= 2;
		ans += a*b;

		if(b>M/2){
			ans += b-M/2;
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <math.h>

#define M 1000000007

int main(void){
	int T;
	long long int N,ans,x,val;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		ans = 0;

		scanf("%lld",&N);
		assert(N>=1 && N<=10000000000);

		x = (long long int) floor(sqrt(N));

		for(long long int i=1;i<=x;i++){
			val = i;
			val = ((val%M)*((i+(long long int) floor(N/i))%M))%M;
			val = ((val%M)*((1+(long long int) floor(N/i)-i)%M))%M;

			ans = (ans%M+val%M)%M;
		}

		ans = (ans%M-((x*(x+1)*(2*x+1))/6)%M+M)%M;
		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
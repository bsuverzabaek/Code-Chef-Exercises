#include <stdio.h>
#include <assert.h>
#define MOD 1000000007

int main(void){
	int N,K,x,j,str;
	long long int ans;

	scanf("%d %d",&N,&K);

	assert(N>=1 && N<=1000000);
	assert(K>=2 && K<=100000);

	int A[N+1];
	int B[N+1];

	str = 0;
	ans = 1;

	for(int i=1;i<=N;i++){
		scanf("%d",&x);
		assert(x>=1 && x<=1000000);

		for(j=str;j>0;j--){
			if(x<A[j]){
				ans *= (i-B[j]+1)%MOD;
			}else{
				break;
			}
		}

		A[j+1] = x;
		B[j+1] = i;
		str = j+1;
	}

	printf("%lld\n",ans%MOD);
	
	return 0;
}
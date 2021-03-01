#include <stdio.h>
#include <assert.h>

long long int min(long long int a,long long int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,mod;
	long long int L,R,count,count2,count3,ans;

	mod = 1000000007;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld %lld",&L,&R);
		
		assert(L>=1 && L<=R);
		assert(R<=1000000000000000000);

		count = 0;
		count2 = 0;
		count3 = 0;
		ans = 0;

		for(int i=0;i<60;i++){
			count = min(R-L+1,count3-count2+1)%mod;

			if(L & ((long long int)1<<i)){
				ans += (count*(((long long int)1<<i)%mod)%mod)%mod;
				count2 += ((long long int)1<<i);
			}

			count3 += ((long long int)1<<i);
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
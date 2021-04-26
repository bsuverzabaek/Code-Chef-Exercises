#include <stdio.h>
#include <assert.h>
#define MOD 1000000007

int main(void){
	int T,k,n;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&n,&k);

		assert(k>=1 && k<=n);
		assert(n>=k && n<=100000);

		int a[n+1];
		a[0] = 1;

		for(int i=1;i<=n;i++){
			if(i-k>=0){
				a[i] = a[i-1]+a[i-k];
			}else{
				a[i] = a[i-1];
			}

			if(a[i]>=MOD){
				a[i] %= MOD;
			}
		}

		printf("%d\n",a[n]);

		T--;
	}
	
	return 0;
}
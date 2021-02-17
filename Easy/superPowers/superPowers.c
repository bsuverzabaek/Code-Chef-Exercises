#include <stdio.h>
#include <assert.h>

typedef unsigned long long int LL;
LL mod = 1000000007;

int bigMod(LL a,LL b){
	if(b==0){
		return 1;
	}

	LL x = bigMod(a,b/2);
	x = (x*x)%mod;

	if(b%2!=0){
		x = (x*a)%mod;
	}

	return x;
}

int main(void){
	int T,n;
	LL N,p10;

	scanf("%d",&T);

	while(T>0){
		scanf("%d",&n);
		assert(n>=1 && n<=600000);

		N = 0;
		p10 = 1;

		while(n){
			N += (n&1)*p10;
			p10 *= 10;
			n /= 2;
		}

		printf("%d\n",bigMod(bigMod(2,N),2));

		T--;
	}
	
	return 0;
}
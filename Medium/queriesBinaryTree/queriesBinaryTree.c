#include <stdio.h>
#include <assert.h>

long long int LCA(long long int u,long long int v, long long int a, long long int b){
	while(u!=v){
		if(u>v){
			u >>= 1;
			a <<= 1;
		}else if(v>u){
			v >>= 1;
			b <<= 1;
		}
	}

	return u;
}

int main(void){
	int Q;
	long long int n,u,v,a,b,ans;

	scanf("%d",&Q);
	assert(Q>=1 && Q<=20000);

	while(Q>0){
		scanf("%lld %lld %lld",&n,&u,&v);

		assert(u>=1 && u<=n);
		assert(v>=1 && v<=n);
		assert(n<=1000000000);

		a = 1;
		b = 1;

		if(u>v){
			ans = u;
			u = v;
			v = ans;
		}

		ans = LCA(u,v,a,b);

		if(b>a){
			a = b;
		}

		printf("%lld\n",ans+(n-v)/a);

		Q--;
	}
	
	return 0;
}
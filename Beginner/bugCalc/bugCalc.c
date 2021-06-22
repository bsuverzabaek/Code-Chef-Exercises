#include <stdio.h>
#include <assert.h>

int main(void){
	int T,a,b,p,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&a,&b);

		assert(a>=1 && a<=1000000000);
		assert(b>=1 && b<=1000000000);

		p = 1;
		ans = 0;

		while(a!=0 && b!=0){
			ans += (p*((a+b)%10));
			a /= 10;
			b /= 10;
			p *= 10;
		}

		if(a!=0){
			ans += (p*a);
		}

		if(b!=0){
			ans += (p*b);
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int D,H,temp,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%lld %lld",&D,&H);

		assert(D>=0 && D<=100000);
		assert(H>=0 && H<=100000);

		if(D>H){
			temp = D;
			D = H;
			H = temp;
		}

		if(D==0 && H!=0){
			printf("-1\n");
		}else if(D==0 && H==0){
			printf("0\n");
		}else if(D==H){
			printf("%lld\n",D);
		}else{
			ans = 0;

			while(D<H-D){
				D *= 2;
				ans++;
			}

			ans += H;
			ans++;

			printf("%lld\n",ans);
		}

		T--;
	}
	
	return 0;
}
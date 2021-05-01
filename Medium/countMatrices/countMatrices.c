#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,pro,count;
	long long int ans,d;

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%d",&N);
		assert(N>=3 && N<=2500);

		ans = 0;

		for(int i=N-1;i>=1;i--){
			d = 0;
			pro = i*(N-i)-1;
			count = 0;

			for(int j=1;j*j<=pro;j++){
				count++;
				d = d+(pro/j)-j;
			}

			ans = ans+(d*2)+count;
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
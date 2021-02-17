#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=200000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=1000000000);

		if(!(N&(N-1))){
			printf("-1\n");
		}else{
			ans = 0;

			for(int i=1;i<=N;i<<=1){
				ans += ((N-i)/(i<<1))*i;
			}

			for(int i=2;i<N;i<<=1){
				ans += i;
			}

			printf("%d\n",ans);
		}

		T--;
	}
	
	return 0;
}
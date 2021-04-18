#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;
	double ans,nTemp;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=3000);

		ans = 0;
		nTemp = N;

		for(int i=1;i<=N;i++){
			ans += nTemp/i;
		}

		printf("%.1f\n",ans);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,K,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=1000);
		assert(K>=1 && K<=1000);

		int X[N+1];
		X[0] = 0;

		ans = 0;

		for(int i=1;i<=N;i++){
			scanf("%d",&X[i]);
			assert(X[i]>=1 && X[i]<=1000);
		}

		qsort(X,N+1,sizeof(int),compare);

		for(int i=N;i>=1;i--){
			ans += (X[i]-X[i-1]-1)*((N-i)/K+1);
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
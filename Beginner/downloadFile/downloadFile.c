#include <stdio.h>
#include <assert.h>

int main(void){
	int TC,N,K,ans;

	scanf("%d",&TC);
	assert(TC>=1 && TC<=1000);

	while(TC>0){
		scanf("%d %d",&N,&K);
		assert(N>=1 && N<=10);

		int T[N];
		int D[N];

		for(int i=0;i<N;i++){
			scanf("%d %d",&T[i],&D[i]);
			assert(T[i]>=1 && T[i]<=10);
			assert(D[i]>=1 && D[i]<=10);
		}

		int sum = 0;
		for(int i=0;i<N;i++){
			sum += T[i];
		}
		assert(K>=0 && K<=sum);

		ans = 0;

		for(int i=0;i<N;i++){
			if(T[i]<K){
				K -= T[i];
			}else{
				ans += (T[i]-K)*D[i];
				K = 0;
			}
		}

		printf("%d\n",ans);

		TC--;
	}

	return 0;
}
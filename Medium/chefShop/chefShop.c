#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,N,K,ans,c,w,p,q,l;

	scanf("%d",&T);
	assert(T>=1 && T<=250);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=10);
		assert(K>=1 && K<=100000000);

		int cost[N];
		int weight[N];

		for(int i=0;i<N;i++){
			scanf("%d %d",&cost[i],&weight[i]);

			assert(cost[i]>=1 && cost[i]<=100000000);
			assert(weight[i]>=1 && weight[i]<=100000000);
		}

		p = pow(2,N);
		int subset[10] = {0};
		ans = -1;

		for(int i=0;i<p;i++){
			q = i;
			l = 0;

			while(l<N){
				if((q&1)==1){
					subset[l] = 1;
				}else{
					subset[l] = 0;
				}

				q >>= 1;
				l++;
			}

			c = 0;
			w = 0;

			for(int j=0;j<N;j++){
				if(subset[j]==1){
					c += cost[j];
					w += weight[j];
				}
			}

			if(c<=K && w>ans){
				ans = w;
			}
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
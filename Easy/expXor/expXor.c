#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sumN;
	double ans,prob;

	scanf("%d",&T);
	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		sumN += N;

		if(T==1){
			assert(sumN<=400000);
		}

		int B[N+1];
		double P[N+1];

		for(int i=1;i<=N;i++){
			scanf("%d",&B[i]);
			assert(B[i]>=0 && B[i]<=1000000000);
		}

		for(int i=1;i<=N;i++){
			scanf("%lf",&P[i]);
			assert(P[i]>=0 && P[i]<=1);
		}

		ans = 0;

		for(int i=0;i<30;i++){
			prob = 0;

			for(int j=1;j<=N;j++){
				if((B[j] & (1<<i))!=0){
					prob = prob*(1-P[j])+(1-prob)*P[j];
				}
			}

			ans += prob*(1<<i);
		}

		printf("%.15lf\n",ans);

		T--;
	}
	
	return 0;
}
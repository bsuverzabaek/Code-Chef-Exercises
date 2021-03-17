#include <stdio.h>
#include <assert.h>
#include <limits.h>
#include <stdlib.h>

int main(void){
	int T,N,M,sumN,sumM;
	long long int max,max_upto,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	sumN = 0;
	sumM = 0;

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=3 && N<=1000);
		assert(M>=3 && M<=1000);

		sumN += N;
		sumM += M;

		if(T==1){
			assert(sumN<=1000);
			assert(sumM<=1000);
		}

		int G[N+1][M+1];
		int left[N+1][M+1];
		int right[N+1][M+1];
		int up[N+1][M+1];
		int down[N+1][M+1];

		max = INT_MIN;

		for(int i=1;i<=N;i++){
			for(int j=1;j<=M;j++){
				scanf("%d",&G[i][j]);
				assert(abs(G[i][j])<=1000000);
			}
		}

		for(int i=1;i<=N;i++){
			max_upto = 0;
			for(int j=1;j<=M;j++){
				if(max_upto>=0){
					max_upto += G[i][j];
					left[i][j] = max_upto;
				}else{
					max_upto = G[i][j];
					left[i][j] = max_upto;
				}
			}
		}

		for(int i=1;i<=N;i++){
			max_upto = 0;
			for(int j=M;j>=1;j--){
				if(max_upto>=0){
					max_upto += G[i][j];
					right[i][j] = max_upto;
				}else{
					max_upto = G[i][j];
					right[i][j] = max_upto;
				}
			}
		}

		for(int j=1;j<=M;j++){
			max_upto = 0;
			for(int i=1;i<=N;i++){
				if(max_upto>=0){
					max_upto += G[i][j];
					up[i][j] = max_upto;
				}else{
					max_upto = G[i][j];
					up[i][j] = max_upto;
				}
			}
		}

		for(int j=1;j<=M;j++){
			max_upto = 0;
			for(int i=N;i>=1;i--){
				if(max_upto>=0){
					max_upto += G[i][j];
					down[i][j] = max_upto;
				}else{
					max_upto = G[i][j];
					down[i][j] = max_upto;
				}
			}
		}

		for(int i=2;i<N;i++){
			for(int j=2;j<M;j++){
				ans = (G[i][j]+left[i][j-1]+right[i][j+1]+up[i-1][j]+down[i+1][j]);
				if(ans>max){
					max = ans;
				}
			}
		}

		printf("%lld\n",max);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,pos,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=20000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=4);

		int W[N];
		int L[N];
		int X[N];

		for(int i=0;i<N;i++){
			scanf("%d",&W[i]);
			assert(W[i]>=1 && W[i]<=N);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&L[i]);
			assert(L[i]>=1 && L[i]<=5);
			X[i] = i;
		}

		ans = 0;

		for(int i=1;i<=N;i++){
			pos = -1;

			for(int j=0;j<N;j++){
				if(W[j]==i){
					pos = X[j];
				}
			}

			for(int j=0;j<N;j++){
				while(W[j]>i && X[j]<=pos){
					X[j] += L[j];
					ans++;
				}
			}
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
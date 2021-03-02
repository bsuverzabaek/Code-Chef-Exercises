#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,Q,l,r,carry,sumN,sumQ;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	sumN = 0;
	sumQ = 0;

	while(T>0){
		scanf("%d %d",&N,&Q);

		assert(N>=1 && N<=100000);
		assert(Q>=1 && Q<=100000);

		sumN += N;
		sumQ += Q;

		if(T==1){
			assert(sumN<=1000000);
			assert(sumQ<=1000000);
		}

		int arr[N+1];
		int CS[N+1];
		int CE[N+1];
		int ans[N+1];

		for(int i=0;i<N+1;i++){
			arr[i] = 0;
			CS[i] = 0;
			CE[i] = 0;
			ans[i] = 0;
		}

		for(int i=0;i<Q;i++){
			scanf("%d %d",&l,&r);
			
			assert(l>=1 && l<=r);
			assert(r>=l && r<=N);

			CS[l]++;
			CE[r]++;
			arr[l]++;

			if(r!=N){
				arr[r+1] += l-r-1;
			}
		}

		carry = 0;

		for(int i=1;i<N+1;i++){
			ans[i] = ans[i-1]+carry+arr[i];
			carry += CS[i]-CE[i];
		}

		for(int i=1;i<N+1;i++){
			printf("%d ",ans[i]);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
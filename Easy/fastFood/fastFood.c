#include <stdio.h>
#include <assert.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,sumN,sumB,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);
		sumN += N;

		if(T==1){
			assert(sumN<=1000000);
		}

		int A[N];
		int B[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=10000);
		}

		sumB = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&B[i]);
			assert(B[i]>=1 && B[i]<=10000);
			sumB += B[i];
		}

		ans = sumB;

		for(int i=0;i<N;i++){
			sumB += A[i]-B[i];
			ans = max(ans,sumB);
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
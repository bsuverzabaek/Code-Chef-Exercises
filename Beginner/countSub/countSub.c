#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,subLen,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
		}

		subLen = 0;
		ans = N;

		for(int i=1;i<N;i++){
			if(A[i]>=A[i-1]){
				subLen++;
			}else{
				ans += (subLen*(subLen+1))/2;
				subLen = 0;
			}
		}

		ans += (subLen*(subLen+1))/2;
		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,N,D,risk,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&D);

		assert(N>=1 && N<=10000);
		assert(D>=1 && D<=100000);

		int A[N];
		risk = 0;
		ans = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=100);

			if(A[i]>=80 || A[i]<=9){
				risk++;
			}
		}

		ans += ceil((double)risk/D) + ceil((double)(N-risk)/D);

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
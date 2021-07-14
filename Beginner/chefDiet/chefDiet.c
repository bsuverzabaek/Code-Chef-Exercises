#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,prt,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=200);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		scanf("%d",&K);
		assert(K>=1 && K<=1000000);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000);
		}

		prt = 0;
		flag = 0;

		for(int i=1;i<=N;i++){
			prt += A[i-1]-K;

			if(prt<0){
				flag = i;
				break;
			}
		}

		if(flag==0){
			printf("YES\n");
		}else{
			printf("NO %d\n",flag);
		}

		T--;
	}
	
	return 0;
}
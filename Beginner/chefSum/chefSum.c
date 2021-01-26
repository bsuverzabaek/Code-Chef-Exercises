#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=2 && N<=10000);
		assert(K>=1 && K<=1000000000);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
		}

		flag = 0;

		for(int i=0;i<N-1;i++){
			for(int j=i+1;j<N;j++){
				if(A[i]+A[j]==K){
					flag = 1;
					goto x;
				}
			}
		}

		x:if(flag==1){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		T--;
	}

	return 0;
}
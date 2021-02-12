#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int main(void){
	int T,N,K,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=30000);
		assert(K>=0 && K<=30000);

		int A[N];
		sum = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]==0 || A[i]==1);

			if(A[i]!=0){
				if(i%2!=0 && sum>0){
					sum--;
				}else if(i%2!=0){
					sum++;
				}else if(sum<0){
					sum--;
				}else{
					sum++;
				}
			}
		}

		if(abs(sum)<K){
			printf("2\n");
		}else{
			printf("1\n");
		}

		T--;
	}
	
	return 0;
}
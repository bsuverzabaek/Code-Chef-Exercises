#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,sumN,j;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000);

		sumN += N;

		if(T==1){
			assert(sumN>=1 && sumN<=1000);
		}

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000);
		}

		qsort(A,N,sizeof(int),compare);

		int B[3];
		j = 0;

		for(int i=0;i<N-1;i++){
			if(A[i]==A[i+1]){
				j++;
				B[j] = A[i];
				i++;
			}

			if(j==2){
				break;
			}
		}

		if(j!=2){
			printf("-1\n");
		}else{
			printf("%d\n",B[1]*B[2]);
		}

		T--;
	}
	
	return 0;
}
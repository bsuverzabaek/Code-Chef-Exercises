#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int N,i;

	scanf("%d",&N);
	assert(N>=2 && N<=100000);

	int A[N];

	for(int i=0;i<N;i++){
		scanf("%d",&A[i]);
		assert(A[i]>=1 && A[i]<=1000000000);
	}

	qsort(A,N,sizeof(int),compare);

	for(i=0;i<N-1;i++){
		if(A[i]!=A[i+1]){
			break;
		}
	}

	if(i==N-1){
		printf("0\n");
	}else{
		for(i=N-2;i>=0;i--){
			if(A[i]<A[N-1]){
				printf("%d\n",A[i]);
				break;
			}
		}
	}
	
	return 0;
}
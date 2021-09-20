#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
		}

		qsort(A,N,sizeof(int),compare);
		ans = 0;

		for(int i=0;i<N;i++){
			if(i%2==0){
				ans += A[i];
			}
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
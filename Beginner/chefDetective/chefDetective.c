#include <stdio.h>
#include <assert.h>

int main(void){
	int N;

	scanf("%d",&N);
	assert(N>=1 && N<=100000);

	int R[N];
	int B[100001] = {0};

	for(int i=0;i<N;i++){
		scanf("%d",&R[i]);
		assert(R[i]>=0 && R[i]<=N);
		B[R[i]] = 1;
	}

	for(int i=0;i<=N;i++){
		if(B[i]==0){
			printf("%d ",i);
		}
	}

	printf("\n");
	
	return 0;
}
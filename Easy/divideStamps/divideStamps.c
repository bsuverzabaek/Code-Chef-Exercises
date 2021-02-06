#include <stdio.h>
#include <assert.h>

int main(void){
	int N,sum;

	scanf("%d",&N);
	assert(N>=1 && N<=100000);

	int C[N];
	sum = 0;

	for(int i=0;i<N;i++){
		scanf("%d",&C[i]);
		assert(C[i]>=1 && C[i]<=1000000000);

		sum += C[i];
	}

	if(sum==N*(N+1)/2){
		printf("YES\n");
	}else{
		printf("NO\n");
	}

	return 0;
}
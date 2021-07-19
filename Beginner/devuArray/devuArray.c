#include <stdio.h>
#include <assert.h>

int main(void){
	int N,Q,t,min,max;

	scanf("%d %d",&N,&Q);

	assert(N>=1 && N<=100000);
	assert(Q>=1 && Q<=100000);

	int A[N];

	for(int i=0;i<N;i++){
		scanf("%d",&A[i]);
	}

	min = A[0];
	max = A[0];

	for(int i=0;i<N;i++){
		if(A[i]>max){
			max = A[i];
		}

		if(A[i]<min){
			min = A[i];
		}
	}

	while(Q>0){
		scanf("%d",&t);
		assert(t>=0 && t<=1000000000);

		if((t>=min) && (t<=max)){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		Q--;
	}
	
	return 0;
}
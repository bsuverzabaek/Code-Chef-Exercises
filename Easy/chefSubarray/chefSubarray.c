#include <stdio.h>
#include <assert.h>

int main(void){
	int N,count,max;

	scanf("%d",&N);
	assert(N>=1 && N<=100000);

	int A[N];

	for(int i=0;i<N;i++){
		scanf("%d",&A[i]);
		assert(A[i]>=0 && A[i]<=10000);
	}

	if(A[0]==0){
		count = 0;
	}else{
		count = 1;
	}

	max = count;

	for(int i=1;i<N;i++){
		if(A[i]!=0){
			count++;
		}else{
			if(count>max){
				max = count;
			}
			count = 0;
		}
	}

	printf("%d\n",max);
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int A[10000001] = {0};

int main(void){
	int N,start,end,max;

	scanf("%d",&N);
	assert(N>=1 && N<=100000);

	max = 0;

	while(N>0){
		scanf("%d %d",&start,&end);

		assert(start>=1 && start<=10000000);
		assert(end>=1 && end<=10000000);

		A[start] += 1;
		A[end+1] -= 1;

		N--;
	}

	for(int i=2;i<10000001;i++){
		A[i] += A[i-1];

		if(max<A[i]){
			max = A[i];
		}
	}

	printf("%d\n",max);
	
	return 0;
}
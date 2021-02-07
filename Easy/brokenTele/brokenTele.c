#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,count;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100000);

		int A[N];
		count = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
		}

		for(int i=1;i<N-1;i++){
			if(A[i]!=A[i-1] || A[i]!=A[i+1]){
				count++;
			}

			if(i==1 && A[i-1]!=A[i]){
				count++;
			}

			if(i==N-2 && A[i+1]!=A[i]){
				count++;
			}
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
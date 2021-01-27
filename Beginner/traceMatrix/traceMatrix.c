#include <stdio.h>
#include <assert.h>

int max(int *trace,int N){
	int max = 0;

	for(int i=0;i<N;i++){
		if(trace[i]>max){
			max = trace[i];
		}
	}

	return max;
}

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100);

		int A[N][N];
		int trace[2*N];

		for(int i=0;i<2*N;i++){
			trace[i] = 0;
		}

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				scanf("%d",&A[i][j]);
				assert(A[i][j]>=1 && A[i][j]<=100);
				trace[i-j+(N-1)] += A[i][j];
			}
		}

		printf("%d\n",max(trace,2*N));

		T--;
	}

	return 0;
}
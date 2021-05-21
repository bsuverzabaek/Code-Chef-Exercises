#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,temp;

	scanf("%d",&T);
	assert(T<=50);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=200000);

		int w[N];
		int num[N];

		for(int i=0;i<N;i++){
			scanf("%d",&w[i]);
			num[i] = i+1;
		}

		for(int i=N-1;i>=0;i--){
			temp = num[i-w[i]];

			for(int j=i-w[i];j<i;j++){
				num[j] = num[j+1];
			}

			num[i] = temp;
		}

		for(int i=0;i<N;i++){
			printf("%d ",num[i]);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
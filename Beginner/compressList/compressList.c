#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,i,count;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000);

			if(i>0){
				assert(A[i]>A[i-1]);
			}
		}

		i = 0;
		printf("%d",A[0]);

		while(i<N-1){
			count = 0;

			while(i<N-1){
				if(A[i+1]!=A[i]+1){
					break;
				}

				i++;
				count++;
			}

			if(count==0){
				i++;
			}
			if(count>=2){
				printf("...%d",A[i]);
			}else{
				printf(",%d",A[i]);
			}
		}

		printf("\n");

		T--;
	}

	return 0;
}
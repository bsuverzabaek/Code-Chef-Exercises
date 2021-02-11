#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,xor,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000 && N%2!=0);

		int A[N];
		int B[N];
		int C[N];
		int count[100000] = {0};

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=0 && A[i]<=1000000);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&B[i]);
			assert(B[i]>=0 && B[i]<=1000000);
			count[B[i]]++;
		}

		xor = 0;

		for(int i=0;i<N;i++){
			xor ^= A[i];
		}

		for(int i=0;i<N;i++){
			xor ^= B[i];
		}

		flag = 0;

		for(int i=0;i<N;i++){
			if(count[xor^A[i]]>0){
				count[xor^A[i]]--;
				C[i] = xor^A[i];
			}else{
				flag = 1;
				break;
			}
		}

		if(flag==0){
			for(int i=0;i<N;i++){
				printf("%d ",C[i]);
			}
			printf("\n");
		}else{
			printf("-1\n");
		}

		T--;
	}
	
	return 0;
}
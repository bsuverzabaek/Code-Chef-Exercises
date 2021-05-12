#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sumN,O,P,L;

	scanf("%d",&T);
	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		sumN += N;

		if(T==1){
			assert(sumN>=1 && sumN<=100000);
		}

		int A[N+1];
		long long int B[N+1];
		int M[N];

		for(int i=0;i<N;i++){
			M[i] = -1;
		}

		M[0] = 0;
		A[0] = 0;
		B[0] = 0;

		for(int i=1;i<=N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
			B[i] = B[i-1]+(long long int)A[i];
		}

		O = 0;
		P = 0;

		for(int i=1;i<=N;i++){
			L = B[i]%N;

			if(M[L]==-1){
				M[L] = i;
			}else{
				O = i;
				P = M[L];
				break;
			}
		}

		printf("%d\n",O-P);

		for(int i=P+1;i<=O;i++){
			printf("%d",i);

			if(i!=O){
				printf(" ");
			}

			printf("\n");
		}

		T--;
	}
	
	return 0;
}
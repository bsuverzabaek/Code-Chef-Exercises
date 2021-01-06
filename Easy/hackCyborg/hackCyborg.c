#include <stdio.h>

int rangeMin(int *A, int a, int b){
	int min = 1000000000;

	for(int i=a;i<=b;i++){
		if(A[i]<min){
			min = A[i];
		}
	}

	return min;
}

int main(void){
	int T;

	while(1){
		printf("Input T: ");
		scanf("%d",&T);

		if(T<=0 || T>100000){
			printf("T must be 1 <= T <= 10^5\n");
		}else{
			break;
		}
	}

	while(T>0){
		int N;
		int M;

		while(1){
			scanf("%d %d",&N,&M);

			if(N<=0 || N>100000){
				printf("N must be 1 <= N <= 10^5\n");
			}else if(M<=0 || M>100000){
				printf("M must be 1 <= M <= 10^5\n");
			}else{
				break;
			}
		}

		int A[N];
		int B[M];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&A[i]);
				if(A[i]<=0 || A[i]>1000000000){
					printf("A[%d] must be 1 <= A[i] <= 10^9\n",i);
				}else{
					break;
				}
			}
		}

		for(int i=0;i<M;i++){
			while(1){
				scanf("%d",&B[i]);
				if(B[i]<=0 || B[i]>N){
					printf("B[%d] must be 1 <= B[i] <= N\n",i);
				}else{
					break;
				}
			}
		}

		int sum = 0;

		for(int i=0;i<M;i++){
			for(int j=i;j<M;j++){
				sum += rangeMin(A,B[i]-1,B[j]-1);
			}
		}

		printf("%d\n",sum);

		T--;
	}

	return 0;
}
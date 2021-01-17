#include <stdio.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)b-*(int*)a;
}

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int N,X,Y,maxTip;

	while(1){
		scanf("%d %d %d",&N,&X,&Y);

		if(N<=0 || N>100000){
			printf("N must be 1 <= N <= 10^5\n");
		}else if(X<=0 || X>N){
			printf("X must be 1 <= X <= N\n");
		}else if(Y<=0 || Y>N){
			printf("Y must be 1 <= Y <= N\n");
		}else if((X+Y)<N){
			printf("X + Y must be >= N\n");
		}else{
			break;
		}
	}

	int A[N];
	int B[N];
	int diff[N];

	for(int i=0;i<N;i++){
		while(1){
			scanf("%d",&A[i]);

			if(A[i]<=0 || A[i]>10000){
				printf("A[%d] must be 1 <= A[i] <= 1000\n",i);
			}else{
				break;
			}
		}
	}

	for(int i=0;i<N;i++){
		while(1){
			scanf("%d",&B[i]);

			if(B[i]<=0 || B[i]>10000){
				printf("B[%d] must be 1 <= B[i] <= 1000\n",i);
			}else{
				break;
			}
		}

		diff[i] = B[i] - A[i];
	}

	qsort(diff,N,sizeof(int),compare);

	maxTip = 0;

	for(int i=0;i<N;i++){
		maxTip += A[i];
	}

	for(int i=0;i<N-X;i++){
		maxTip += diff[i];
	}

	for(int i=N-X;i<Y;i++){
		maxTip = max(maxTip+diff[i],maxTip);
	}

	printf("%d\n",maxTip);

	return 0;
}
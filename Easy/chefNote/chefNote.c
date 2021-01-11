#include <stdio.h>

int main(void){
	int T,X,Y,K,N;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100000){
			printf("T must be 1 <= T <= 10^5\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d %d %d",&X,&Y,&K,&N);

			if(Y<=0 || Y>X){
				printf("Y must be 1 <= Y < X\n");
			}else if(X<Y || X>1000){
				printf("X must be Y < X <= 10^3\n");
			}else if(K<=0 || K>1000){
				printf("K must be 1 <= K <= 10^3\n");
			}else if(N<=0 || N>100000){
				printf("N must be 1 <= N <= 10^5\n");
			}else{
				break;
			}
		}

		int P[N];
		int C[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d %d",&P[i],&C[i]);

				if(P[i]<=0 || P[i]>1000){
					printf("P[%d] must be 1 <= P[i] <= 10^3\n",i);
				}else if(C[i]<=0 || C[i]>1000){
					printf("C[%d] must be 1 <= C[i] <= 10^3\n",i);
				}else{
					break;
				}
			}
		}

		X -= Y;

		for(int i=0;i<N;i++){
			if(P[i]>=X && K>=C[i]){
				printf("LuckyChef\n");
				break;
			}else if(i==N-1){
				if(X>P[i] || C[i]>K){
					printf("UnluckyChef\n");
				}
			}
		}

		T--;
	}

	return 0;
}
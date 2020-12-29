#include <stdio.h>

int main(void){
	int T;

	while(1){
		printf("Input T: ");
		scanf("%d",&T);

		if(T<=0 || T>10){
			printf("T must be 1 <= T <= 10\n");
		}else{
			break;
		}
	}

	while(T>0){
		int N;
		int K;

		while(1){
			scanf("%d %d",&N,&K);

			if(N>100 || N<K){
				printf("N must be K <= N <= 100\n");
			}else if(K<=0 || K>N){
				printf("K must be 1 <= K <= N\n");
			}else{
				break;
			}
		}

		int a[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&a[i]);
				if(a[i]<=0 || a[i]>100){
					printf("a[%d] must be 1 <= a[i] <= 100\n",i);
				}else{
					break;
				}
			}
		}

		int max = 0;

		for(int i=0;i<N-1;i++){
			if(a[i]+a[i+1]>max){
				max = a[i] + a[i+1];
			}
		}

		printf("%d\n",max);

		T--;
	}

	return 0;
}
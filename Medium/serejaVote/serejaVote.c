#include <stdio.h>

int main(void){
	int T,N;
	int sum,over,count;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>50){
			printf("T must be 1 <= T <= 50\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>10000){
				printf("N must be 1 <= N <= 10000\n");
			}else{
				break;
			}
		}

		int B[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&B[i]);

				if(B[i]<0 || B[i]>1000){
					printf("B[%d] must be 0 <= B[i] <= 1000\n",i);
				}else{
					break;
				}
			}
		}

		sum = 0;
		over = 0;
		count = 0;

		for(int i=0;i<N;i++){
			if(B[i]>100){
				over = 1;
			}else if(B[i]>0){
				count++;
			}

			sum += B[i];
		}

		if(over==0 && sum-100>=0 && sum-100<count){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <stdlib.h>

int main(void){
	int N,max,sum1,sum2;

	while(1){
		scanf("%d",&N);

		if(N<=0 || N>10000){
			printf("N must be 1 <= N <= 10000\n");
		}else{
			break;
		}
	}

	int p1[N];
	int p2[N];

	max = 0;
	sum1 = 0;
	sum2 = 0;

	for(int i=0;i<N;i++){
		while(1){
			scanf("%d %d",&p1[i],&p2[i]);

			if(p1[i]<=0 || p1[i]>1000){
				printf("p1[%d] must be 1 <= p1[i] <= 1000\n",i);
			}else if(p2[i]<=0 || p2[i]>1000){
				printf("p2[%d] must be 1 <= p2[i] <= 1000\n",i);
			}else{
				break;
			}
		}

		sum1 += p1[i];
		sum2 += p2[i];

		if(abs(sum1-sum2)>max){
			max = sum1-sum2;
		}
	}

	if(max>0){
		printf("1 %d\n",abs(max));
	}else{
		printf("2 %d\n",abs(max));
	}

	return 0;
}
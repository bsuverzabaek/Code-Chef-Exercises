#include <stdio.h>

int main(void){
	int T,Q,P;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d",&Q,&P);

			if(Q<=0 || Q>100000 || P<=0 || P>100000){
				printf("Q and P must be 1 <= Q,P <= 100000\n");
			}else{
				break;
			}
		}

		if(Q>1000){
			double total = (double)Q*P;
			total -= (Q*P*0.1);
			printf("%f\n",total);
		}else{
			printf("%f\n",(double)Q*P);
		}

		T--;
	}

	return 0;
}
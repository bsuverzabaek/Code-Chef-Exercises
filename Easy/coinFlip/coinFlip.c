#include <stdio.h>

int main(void){
	int T;
	int G;
	int N;
	int I;
	int Q;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>10){
			printf("T must be 1 <= T <= 10\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&G);

			if(G<=0 || G>20000){
				printf("G must be 1 <= G <= 20000\n");
			}else{
				break;
			}
		}

		for(int g=1;g<=G;g++){
			while(1){
				scanf("%d %d %d",&I,&N,&Q);

				if(N<=0 || N>1000000000){
					printf("N must be 1 <= N <= 10^9\n");
				}else if(I<=0 || I>2){
					printf("I must be 1 <= I <= 2\n");
				}else if(Q<=0 || Q>2){
					printf("Q must be 1 <= Q <= 2\n");
				}else{
					break;
				}
			}

			if(N%2==0 || I==Q){
				printf("%d\n",N/2);
			}else{
				printf("%d\n",(N/2)+1);
			}
		}

		T--;
	}

	return 0;
}
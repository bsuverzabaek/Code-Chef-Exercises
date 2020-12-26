#include <stdio.h>

int main(void){
	int T;

	while(1){
		printf("Input T: ");
		scanf("%d",&T);

		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){
		int X;

		while(1){
			printf("Input X: ");
			scanf("%d",&X);

			if(X<0 || X>1000000000){
				printf("X must be 0 <= X <= 10^9\n");
			}else{
				break;
			}
		}

		if(X%10==0){
			printf("0\n");
		}else if(X%5==0){
			printf("1\n");
		}else{
			printf("-1\n");
		}

		T--;
	}
	
	return 0;
}
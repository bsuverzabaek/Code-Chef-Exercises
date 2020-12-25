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
		int A;
		int B;
		int C;

		while(1){
			printf("Input A: ");
			scanf("%d",&A);

			if(A<=0 || A>180){
				printf("A must be 1 <= A <= 180\n");
			}else{
				break;
			}
		}

		while(1){
			printf("Input B: ");
			scanf("%d",&B);

			if(B<=0 || B>180){
				printf("B must be 1 <= B <= 180\n");
			}else{
				break;
			}
		}

		while(1){
			printf("Input C: ");
			scanf("%d",&C);

			if(C<=0 || C>180){
				printf("C must be 1 <= C <= 180\n");
			}else{
				break;
			}
		}

		if(A+B+C==180){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}

	return 0;
}
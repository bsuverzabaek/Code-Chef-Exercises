#include <stdio.h>

int sum(int A, int B){
	return A + B;
}

int main(void){
	int T;

	while(1){
		printf("Input T: ");
		scanf("%d",&T);

		if(T<1 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){
		int A;
		int B;

		while(1){
			printf("Input A: ");
			scanf("%d",&A);

			if(A<0 || A>10000){
				printf("A must be 0 <= A <= 10000\n");
			}else{
				break;
			}
		}

		while(1){
			printf("Input B: ");
			scanf("%d",&B);

			if(B<0 || B>10000){
				printf("B must be 0 <= B <= 10000\n");
			}else{
				break;
			}
		}

		printf("%d\n",sum(A,B));

		T--;
	}

	return 0;
}
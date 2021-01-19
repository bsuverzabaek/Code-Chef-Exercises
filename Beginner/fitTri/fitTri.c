#include <stdio.h>

int main(void){
	int T,B;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 10^3\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			printf("Input Base B: ");
			scanf("%d",&B);

			if(B<=0 || B>10000){
				printf("B must be 1 <= B <= 10^4\n");
			}else{
				break;
			}
		}

		B /= 2;

		printf("%d\n",(B*(B-1))/2);

		T--;
	}

	return 0;
}
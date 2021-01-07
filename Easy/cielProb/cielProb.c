#include <stdio.h>

int main(void){
	int A;
	int B;

	while(1){
		scanf("%d %d",&A,&B);

		if(B<=0 || B>=A || A<=B || A>10000){
			printf("A and B must be 1 <= B < A <= 10000\n");
		}else{
			break;
		}
	}

	if((A-B)%10==9){
		printf("%d\n",A-B-1);
	}else{
		printf("%d\n",A-B+1);
	}

	return 0;
}
#include <stdio.h>

int main(void){
	int T,A,B;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>10000){
			printf("T must be 1 <= T <= 10000\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d",&A,&B);

			if(A<=0 || A>1000000001 || B<=0 || B>1000000001){
				printf("A and B must be 1 <= A,B <= 1000000001\n");
			}else{
				break;
			}
		}

		if(A<B){
			printf("<\n");
		}else if(A>B){
			printf(">\n");
		}else{
			printf("=\n");
		}

		T--;
	}

	return 0;
}
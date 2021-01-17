#include <stdio.h>

int main(void){
	int T,A,B,C;

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
			scanf("%d %d %d",&A,&B,&C);

			if(A<=0 || A>1000000){
				printf("A must be 1 <= A <= 1000000\n");
			}else if(B<=0 || B>1000000){
				printf("B must be 1 <= B <= 1000000\n");
			}else if(C<=0 || C>1000000){
				printf("C must he 1 <= C <= 1000000\n");
			}else{
				break;
			}
		}

		if((A>B && A<C) || (A>C && A<B)){
			printf("%d\n",A);
		}else if((B>A && B<C) || (B>C && B<A)){
			printf("%d\n",B);
		}else if((C>A && C<B) || (C>B && C<A)){
			printf("%d\n",C);
		}

		T--;
	}

	return 0;
}
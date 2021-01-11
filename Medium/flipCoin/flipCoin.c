#include <stdio.h>

void flipFunc(int *coins,int A, int B){
	for(int i=A;i<=B;i++){
		if(coins[i]==0){
			coins[i] = 1;
		}else{
			coins[i] = 0;
		}
	}
}

int countFunc(int *coins,int A,int B){
	int count = 0;

	for(int i=A;i<=B;i++){
		if(coins[i]==1){
			count++;
		}
	}

	return count;
}

int main(void){
	int N,Q;

	while(1){
		scanf("%d %d",&N,&Q);

		if(N<=0 || N>100000){
			printf("N must be 1 <= N <= 100000\n");
		}else if(Q<=0 || Q>100000){
			printf("Q must be 1 <= Q <= 100000\n");
		}else{
			break;
		}
	}

	int coins[N];

	for(int i=0;i<N;i++){
		coins[i] = 0;
	}

	int num,A,B;

	while(Q>0){

		while(1){
			scanf("%d %d %d",&num,&A,&B);

			if(num<0 || num>1){
				printf("The first number must be 0 or 1\n");
			}else if(A<0 || A>B){
				printf("A must be 0 <= A <= B\n");
			}else if(B<A || B>N-1){
				printf("B must be A <= B <= N-1\n");
			}else{
				break;
			}
		}

		if(num==0){
			flipFunc(coins,A,B);
		}else{
			printf("%d\n",countFunc(coins,A,B));
		}

		Q--;
	}
	
	return 0;
}
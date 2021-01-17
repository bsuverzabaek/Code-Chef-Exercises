#include <stdio.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,A,B;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100){
			printf("T must be 1 <= T <= 100\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d",&A,&B);

			if(A<0 || A>1000000 || B<0 || B>1000000){
				printf("A and B must be 0 <= A,B <= 1000000\n");
			}else{
				break;
			}
		}

		printf("%d %d\n",max(A,B),A+B);

		T--;
	}

	return 0;
}
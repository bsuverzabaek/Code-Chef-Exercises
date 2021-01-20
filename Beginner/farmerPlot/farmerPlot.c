#include <stdio.h>

int main(void){
	int T,M,N,a,b;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>20){
			printf("T must be 1 <= T <= 20\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d",&N,&M);

			if(N<=0 || N>10000 || M<=0 || M>10000){
				printf("M and N must be 1 <= M,N <= 10000\n");
			}else{
				break;
			}
		}

		a = N;
		b = M;

		while(a!=b){
			if(a>b){
				a-=b;
			}else{
				b-=a;
			}
		}

		printf("%d\n",(N/a)*(M/b));

		T--;
	}

	return 0;
}
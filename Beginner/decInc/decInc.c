#include <stdio.h>

int main(void){
	int N;

	while(1){
		scanf("%d",&N);

		if(N<0 || N>1000){
			printf("N must be 0 <= N <= 1000\n");
		}else{
			break;
		}
	}

	if(N%4==0){
		printf("%d\n",N+1);
	}else{
		printf("%d\n",N-1);
	}
	
	return 0;
}
#include <stdio.h>

int main(void){	
	int N,A,count;

	while(1){
		scanf("%d",&N);

		if(N<=0 || N>100){
			printf("N must be 1 <= N <= 100\n");
		}else{
			break;
		}
	}

	count = 0;

	for(int i=0;i<N;i++){
		while(1){
			scanf("%d",&A);

			if(A<=0 || A>100){
				printf("A must be 1 <= A <= 100\n");
			}else{
				break;
			}
		}

		if(A%2==0){
			count++;
		}
	}

	if(count>N-count){
		printf("READY FOR BATTLE\n");
	}else{
		printf("NOT READY\n");
	}
	
	return 0;
}
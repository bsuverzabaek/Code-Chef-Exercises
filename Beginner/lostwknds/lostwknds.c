#include <stdio.h>

int main(void){
	int T;
	int A[5];
	int P;

	while(1){
		printf("Input T: ");
		scanf("%d",&T);
		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){
		for(int i=0;i<5;i++){
			while(1){
				scanf("%d",&A[i]);
				if(A[i]<0 || A[i]>24){
					printf("A[%d] must be 0 <= A[i] <= 24\n",i);
				}else{
					break;
				}
			}
		}

		while(1){
			printf("Input P: ");
			scanf("%d",&P);
			if(P<=0 || P>24){
				printf("P must be 1 <= P <= 24\n");
			}else{
				break;
			}
		}
		

		int sum=0;

		for(int i=0;i<5;i++){
			sum += A[i];
		}

		if(P*sum > 120){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		T--;
	}

	return 0;
}
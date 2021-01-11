#include <stdio.h>

int main(void){
	int T,N,id,sum,root;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>50){
			printf("T must be 1 <= T <= 50\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>30){
				printf("N must be 1 <= N <= 30\n");
			}else{
				break;
			}
		}

		root = 0;

		while(N>0){

			while(1){
				scanf("%d %d",&id,&sum);

				if(id<=0 || id>1000){
					printf("id must be 1 <= id <= 1000\n");
				}else{
					break;
				}
			}

			root += id-sum;

			N--;
		}

		printf("%d\n",root);

		T--;
	}

	return 0;
}
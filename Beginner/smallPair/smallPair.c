#include <stdio.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N;

	while(1){
		scanf("%d",&T);

		if(T<=0){
			printf("T must be greater than 0\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=1){
				printf("N must be greater than 1\n");
			}else{
				break;
			}
		}

		int a[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&a[i]);

				if(a[i]<=0 || a[i]>1000000){
					printf("a[%d] must be 1 <= a[i] <= 10^6\n",i);
				}else{
					break;
				}
			}
		}

		qsort(a,N,sizeof(int),compare);

		printf("%d\n",a[0]+a[1]);

		T--;
	}

	return 0;
}
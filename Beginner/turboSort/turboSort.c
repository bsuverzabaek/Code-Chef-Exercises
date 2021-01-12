#include <stdio.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int t;

	while(1){
		scanf("%d",&t);

		if(t<=0 || t>1000000){
			printf("t must be 1 <= t <= 10^6\n");
		}else{
			break;
		}
	}

	int N[t];

	for(int i=0;i<t;i++){
		while(1){
			scanf("%d",&N[i]);

			if(N[i]<0 || N[i]>1000000){
				printf("N[%d] must be 0 <= N[i] <= 10^6\n",i);
			}else{
				break;
			}
		}
	}

	qsort(N,t,sizeof(int),compare);
	printf("\n");

	for(int i=0;i<t;i++){
		printf("%d\n",N[i]);
	}

	return 0;
}
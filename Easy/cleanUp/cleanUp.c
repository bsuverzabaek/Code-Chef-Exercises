#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int compare(const void *a, const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>50){
			printf("T must be 1 <= T <= 50\n");
		}else{
			break;
		}	
	}

	int n;
	int m;

	while(T>0){

		while(1){
			scanf("%d %d",&n,&m);

			if(m<0 || m>n){
				printf("m must be 0 <= m <= n\n");
			}else if(n<m || n>1000){
				printf("n must be m <= n <= 1000\n");
			}else{
				break;
			}	
		}

		int done[m];

		for(int i=0;i<m;i++){
			while(1){
				scanf("%d",&done[i]);

				if(done[i]<1 || done[i]>n){
					printf("done[%d] must be 1 <= done[i] <= n\n",i);
				}else{
					break;
				}
			}
		}

		bool arr[n];

		for(int i=0;i<n;i++){
			arr[i] = true;
		}

		qsort(done,m,sizeof(int),compare);

		for(int i=0;i<m;i++){
			done[i]--;
		}

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(done[i]==j){
					arr[j]=false;
				}
			}
		}

		int count = 0;

		for(int i=0;i<n;i++){
			if(arr[i]==true){
				count++;
				if(count%2!=0){
					printf("%d ",i+1);
				}
			}
		}

		printf("\n");

		count = 0;

		for(int i=0;i<n;i++){
			if(arr[i]==true){
				count++;
				if(count%2==0){
					printf("%d ",i+1);
				}
			}
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
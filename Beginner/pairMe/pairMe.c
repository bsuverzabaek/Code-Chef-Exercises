#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T;

	scanf("%d",&T);

	while(T>0){
		int a[3];

		for(int i=0;i<3;i++){
			scanf("%d",&a[i]);
			assert(a[i]>=1 && a[i]<=1000);
		}

		qsort(a,3,sizeof(int),compare);

		if(a[0]+a[1]==a[2]){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}
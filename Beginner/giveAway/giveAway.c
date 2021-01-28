#include <stdio.h>
#include <assert.h>

int main(void){
	int T,l,r,k;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d %d",&l,&r,&k);

		assert(l>=1 && l<=r && r<=100);
		assert(k>=1 && k<=100);

		if(l==r){
			printf("1\n");
		}else{
			printf("%d\n",k);
		}

		T--;
	}

	return 0;
}
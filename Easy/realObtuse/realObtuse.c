#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,k,A,B;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d %d",&k,&A,&B);

		assert(k>=3 && k<=1000000000);
		assert(A>=1 && A<=k && B>=1 && B<=k);
		assert(A!=B);

		if(abs(A-B)==k-abs(A-B)){
			printf("0\n");
		}else{
			printf("%d\n",min(abs(A-B),k-abs(A-B))-1);
		}

		T--;
	}
	
	return 0;
}
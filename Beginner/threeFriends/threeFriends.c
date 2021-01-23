#include <stdio.h>
#include <assert.h>

int max(int a,int b,int c){
	if(a>b && a>c){
		return a;
	}else if(b>a && b>c){
		return b;
	}else{
		return c;
	}
}

int main(void){
	int T,X,Y,Z;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d %d",&X,&Y,&Z);

		assert(X>=1 && X<=1000);
		assert(Y>=1 && Y<=1000);
		assert(Z>=1 && Z<=1000);

		if(X+Y+Z==2*max(X,Y,Z)){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,X,Y;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){
		scanf("%d %d",&X,&Y);

		assert(X>=1 && X<=100);
		assert(Y>=1 && Y<=100);
		assert(X>=1 && X<=2*Y);

		if(X>Y){
			printf("%d\n",X-Y);
		}else if(X<=Y){
			printf("0\n");
		}

		T--;
	}
	
	return 0;
}
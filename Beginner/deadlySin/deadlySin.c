#include <stdio.h>
#include <assert.h>

int main(void){
	int T,X,Y,temp;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d",&X,&Y);

		assert(X>=0 && X<=1000000000);
		assert(Y>=0 && Y<=1000000000);

		if(X==0){
			printf("%d\n",Y);
		}else if(Y==0){
			printf("%d\n",X);
		}else{
			if(Y<X){
				temp = Y;
				Y = X;
				X = temp;
			}

			while(Y%X!=0){
				temp = Y%X;
				Y = X;
				X = temp;
			}

			printf("%d\n",2*X);
		}

		T--;
	}
	
	return 0;
}
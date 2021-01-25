#include <stdio.h>
#include <assert.h>

int main(void){
	int T,S,W1,W2,W3;

	scanf("%d",&T);
	assert(T>=1 && T<=64);

	while(T>0){
		scanf("%d %d %d %d",&S,&W1,&W2,&W3);

		assert(S>=1 && S<=8);
		assert((W1>=1 && W1<=2) && (W2>=1 && W2<=2) && (W3>=1 && W3<=2));

		if(S>=W1+W2+W3){
			printf("1\n");
		}else if(S>=W1+W2 || S>=W2+W3){
			printf("2\n");
		}else{
			printf("3\n");
		}

		T--;
	}

	return 0;
}
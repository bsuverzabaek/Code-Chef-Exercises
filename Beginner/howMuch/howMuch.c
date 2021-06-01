#include <stdio.h>
#include <assert.h>

int main(void){
	int R;

	scanf("%d",&R);
	assert(R>=1 && R<=1000000000);

	if(R>=1 && R<=50){
		printf("100\n");
	}else if(R>=51 && R<=100){
		printf("50\n");
	}else{
		printf("0\n");
	}
	
	return 0;
}
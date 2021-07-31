#include <stdio.h>
#include <assert.h>

int main(void){
	int N;

	scanf("%d",&N);
	assert(N>=2 && N<=1000);

	for(int i=10;i>=1;i--){
		if(N%i==0){
			printf("%d\n",i);
			break;
		}
	}
	
	return 0;
}
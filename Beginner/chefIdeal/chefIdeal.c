#include <stdio.h>
#include <assert.h>

int main(void){
	int X;

	printf("1\n");
	fflush(stdout);

	scanf("%i",&X);
	printf("%i\n",5-X);
	
	return 0;
}
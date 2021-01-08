#include <stdio.h>

int main(void){
	int n;

	while(1){
		scanf("%d",&n);

		if(n<0 || n>100000){
			printf("n must be 0 <= n <= 10^5\n");
		}else{
			printf("%d\n",n);
			break;
		}
	}

	return 0;
}
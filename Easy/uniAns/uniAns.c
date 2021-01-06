#include <stdio.h>

int main(void){
	int n;

	while(1){
		scanf("%d",&n);
		if(n<=-100 || n>=100){
			printf("Input must be integers of one or two digits\n");
		}else if(n!=42){
			printf("%d\n",n);
		}else if(n==42){
			break;
		}
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int A,B;
	char C;

	scanf("%d\n%d\n%c",&A,&B,&C);

	assert(A>=-1000 && A<=1000);
	assert(B>=-1000 && B<=1000);
	assert(B!=0);
	assert(C=='+' || C=='-' || C=='*' || C=='/');

	if(C=='+'){
		printf("%d\n",A+B);
	}else if(C=='-'){
		printf("%d\n",A-B);
	}else if(C=='*'){
		printf("%d\n",A*B);
	}else{
		printf("%.1f\n",(double)A/(double)B);
	}
	
	return 0;
}
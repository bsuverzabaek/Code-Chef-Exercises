#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int A,B,C,d;
	float x1,x2;

	scanf("%d %d %d",&A,&B,&C);

	assert(A>=-1000 && A<=1000);
	assert(B>=-1000 && B<=1000);
	assert(C>=-1000 && C<=1000);
	
	d = (B*B)-(4*A*C);

	x1 = (-B+sqrt(d))/(2*A);
	x2 = (-B-sqrt(d))/(2*A);

	printf("%.0f\n",x1);
	printf("%.0f\n",x2);

	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int A,B,C;

	scanf("%d %d %d",&A,&B,&C);

	assert(A>=1 && A<=10);
	assert(B>=1 && B<=10);
	assert(C>=1 && C<=10);

	if(A==B || A==C || B==C){
		printf("YES\n");
	}else{
		printf("NO\n");
	}
	
	return 0;
}
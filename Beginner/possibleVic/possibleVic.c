#include <stdio.h>
#include <assert.h>

int main(void){
	int R,O,C;

	scanf("%d %d %d",&R,&O,&C);

	assert(C>=0 && C<=R && R <= 720);
	assert(O>=1 && O<=19);
	assert(C<=36*O);

	if((20-O)*36>(R-C)){
		printf("YES\n");
	}else{
		printf("NO\n");
	}
	
	return 0;
}
#include <stdio.h>

int main(void){
	int L,B;

	while(1){
		scanf("%d",&L);
		scanf("%d",&B);

		if(L<=0 || L>1000 || B<=0 || B>1000){
			printf("L and B must be 1 <= L,B <= 1000\n");
		}else{
			break;
		}
	}

	if((L*B)>(2*(L+B))){
		printf("Area\n");
		printf("%d\n",L*B);
	}else if((2*(L+B))>(L*B)){
		printf("Peri\n");
		printf("%d\n",2*(L+B));
	}else{
		printf("Eq\n");
		printf("%d\n",L*B);
	}

	return 0;
}
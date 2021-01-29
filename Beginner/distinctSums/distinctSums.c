#include <stdio.h>
#include <assert.h>

int main(void){
	int T,L,R;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d",&L,&R);
		assert(L>=1 && L<=R && R<=1000000);

		printf("%d\n",(2*R)-(2*L)+1);

		T--;
	}

	return 0;
}
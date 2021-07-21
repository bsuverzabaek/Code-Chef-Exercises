#include <stdio.h>
#include <assert.h>

int main(void){
	int T,a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&a,&b);

		assert(a>=1 && a<=1000000000);
		assert(b>=1 && b<=1000000000);

		if(a==b || a<b || a>b){
			printf("YES\n");
		}

		T--;
	}
	
	return 0;
}
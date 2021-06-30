#include <stdio.h>
#include <assert.h>

int main(void){
	int T,n,m;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&n,&m);

		assert(n>=1 && n<=1000000000);
		assert(m>=1 && m<=1000000000);

		if((n*m)%2==0){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		T--;
	}
	
	return 0;
}
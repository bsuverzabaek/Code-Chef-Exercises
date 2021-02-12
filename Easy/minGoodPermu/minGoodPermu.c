#include <stdio.h>
#include <assert.h>

void print_func(int n){
	for(int i=1;i<=n;i+=2){
		printf("%d %d ",i+1,i);
	}
}

int main(void){
	int T,n;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&n);
		assert(n>=2 && n<=100000);

		if(n%2==0){
			print_func(n);
		}else{
			n -= 3;
			print_func(n);
			printf("%d %d %d",n+2,n+3,n+1);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
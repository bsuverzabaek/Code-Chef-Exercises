#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,X,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&N,&X);

		assert(N>=1 && N<=5000);
		assert(X>=1 && X<=N*N);

		flag = 0;

		for(int i=1;i<=N;i++){
			if(X%i==0 && X/i<=N){
				flag = 1;
				break;
			}
		}

		if(flag==1){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		T--;
	}
	
	return 0;
}
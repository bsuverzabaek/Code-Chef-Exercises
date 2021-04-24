#include <stdio.h>
#include <assert.h>

int solve(int n){
	if(n==2 || n==17){
		return 1;
	}else if(n==16 || n==34 || n==289){
		return 0;
	}else{
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				return 1;
			}
		}

		return 0;
	}
}

int main(void){
	int T,N;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100000000);

		if(solve(N)!=0){
			printf("Mike\n");
		}else{
			printf("Tom\n");
		}

		T--;
	}
	
	return 0;
}
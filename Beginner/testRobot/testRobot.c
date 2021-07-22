#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,X,min,max;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&X);

		assert(N>=1 && N<=100);
		assert(X<=1000000);

		char S[N];
		scanf("%s",S);

		min = X;
		max = X;

		for(int i=0;i<N;i++){
			assert(S[i]=='L' || S[i]=='R');

			if(S[i]=='R'){
				X++;

				if(X>max){
					max = X;
				}

				if(X<min){
					min = X;
				}
			}

			if(S[i]=='L'){
				X--;

				if(X>max){
					max = X;
				}

				if(X<min){
					min = X;
				}
			}
		}

		printf("%d\n",(max-min)+1);

		T--;
	}
	
	return 0;
}
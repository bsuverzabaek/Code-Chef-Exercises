#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sumN,c;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100000);

		char S[N];
		scanf("%s",S);

		sumN += N;

		for(int i=0;i<N;i++){
			assert(S[i]>=97 && S[i]<=122);
		}

		if(T==1){
			assert(sumN<=1000000);
		}

		c = 0;

		for(int i=0;i<N-1;i++){
			if(S[i]==S[N-1]){
				c++;
				break;
			}
		}

		if(c>0){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,N,x;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=4 && N<=100000);

		char S[N];
		scanf("%s",S);
		assert(strlen(S)%4==0);

		for(int i=0;i<N;i++){
			assert(S[i]=='0' || S[i]=='1');
		}

		for(int i=0;i<N;i+=4){
			x = 0;
			
			for(int j=0;j<4;j++){
				x = (x<<1) | (S[i+j]-'0');
			}

			printf("%c",(char)(x+'a'));
		}

		printf("\n");

		T--;
	}

	return 0;
}
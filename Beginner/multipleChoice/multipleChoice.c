#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,num,score;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		char S[N];
		char U[N];

		scanf("%s",S);
		scanf("%s",U);

		for(int i=0;i<N;i++){
			assert(S[i]=='A' || S[i]=='B' || S[i]=='C' || S[i]=='D');
			assert(U[i]=='A' || U[i]=='B' || U[i]=='C' || U[i]=='D' || U[i]=='N');
		}

		num = 0;
		score = 0;

		while(num<N){
			if(U[num]=='N'){
				num++;
			}else{
				if(S[num]==U[num]){
					score++;
					num++;
				}else{
					num += 2;
				}
			}
		}

		printf("%d\n",score);

		T--;
	}

	return 0;
}
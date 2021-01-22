#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,count;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		char S[N];
		scanf("%s",S);

		for(int i=0;i<N;i++){
			assert(S[i]>=97 && S[i]<=122);
		}

		count = 0;

		if(N==1){
			printf("%d\n",count);
		}else{
			for(int i=0;i<N-1;i++){
				if(S[i]!='a' || S[i]!='e' || S[i]!='i' || S[i]!='o' || S[i]!='u'){
					if(S[i+1]=='a' || S[i+1]=='e' || S[i+1]=='i' || S[i+1]=='o' || S[i+1]=='u'){
						count++;
					}
				}
			}

			printf("%d\n",count);
		}

		T--;
	}

	return 0;
}
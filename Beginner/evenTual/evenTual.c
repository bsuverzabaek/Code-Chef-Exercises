#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=200);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000);

		char count[26] = {0};
		char S[N];
		scanf("%s",S);

		for(int i=0;i<N;i++){
			assert(S[i]>=97 && S[i]<=122);
		}

		for(int i=0;i<N;i++){
			count[S[i]-97]++;
		}

		flag = 0;

		for(int i=0;i<N;i++){
			if(count[i]%2!=0){
				flag = 1;
				break;
			}
		}

		if(flag==1){
			printf("NO\n");
		}else{
			printf("YES\n");
		}

		T--;
	}

	return 0;
}
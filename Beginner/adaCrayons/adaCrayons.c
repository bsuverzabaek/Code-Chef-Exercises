#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,countU,countD;

	scanf("%d",&T);
	assert(T>=1 && T<=3000);

	while(T>0){
		char S[50];
		scanf("%s",S);

		countU = 0;
		countD = 0;

		for(int i=0;i<strlen(S)-1;i++){
			if(S[i]=='D' && S[i+1]=='U'){
				countD++;
			}else if(S[i]=='U' && S[i+1]=='D'){
				countU++;
			}
		}

		if(S[strlen(S)-1]=='D'){
			countD++;
		}else{
			countU++;
		}

		if(countU<countD){
			printf("%d\n",countU);
		}else{
			printf("%d\n",countD);
		}

		T--;
	}
	
	return 0;
}
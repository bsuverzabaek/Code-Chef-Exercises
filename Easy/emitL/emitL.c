#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,eCount,iCount,lCount,mCount,tCount;
	char S[100];

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%s",S);

		eCount = 0;
		iCount = 0;
		lCount = 0;
		mCount = 0;
		tCount = 0;

		for(int i=0;i<strlen(S);i++){
			if(S[i]=='E'){
				eCount++;
			}

			if(S[i]=='I'){
				iCount++;
			}

			if(S[i]=='L'){
				lCount++;
			}

			if(S[i]=='M'){
				mCount++;
			}

			if(S[i]=='T'){
				tCount++;
			}
		}

		if(strlen(S)<9){
			printf("NO\n");
		}else if(strlen(S)==9){
			if(eCount>=1 && iCount>=2 && lCount>=2 && mCount>=2 && tCount>=2){
				printf("YES\n");
			}
		}else{
			if(eCount>=2 && iCount>=2 && lCount>=2 && mCount>=2 && tCount>=2){
				printf("YES\n");
			}
		}

		T--;
	}
	
	return 0;
}
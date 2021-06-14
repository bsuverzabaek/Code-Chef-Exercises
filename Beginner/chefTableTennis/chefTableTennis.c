#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,count0,count1;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		char S[100];
		scanf("%s",S);

		count0 = 0;
		count1 = 0;

		for(int i=0;i<strlen(S);i++){
			if(S[i]=='1'){
				count1++;
			}else{
				count0++;
			}
		}

		if(count0>count1){
			printf("LOSE\n");
		}else{
			printf("WIN\n");
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,flag,len;
	char S[100000];

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%s",S);
		len = strlen(S);

		for(int i=0;i<len;i++){
			assert(S[i]=='0' || S[i]=='1');
		}

		flag = 0;

		if(len<3){
			printf("Bad\n");
		}else{
			for(int i=0;i<len-2;i++){
				if(S[i]=='0' && S[i+1]=='1' && S[i+2]=='0'){
					flag = 1;
					break;
				}else if(S[i]=='1' && S[i+1]=='0' && S[i+2]=='1'){
					flag = 1;
					break;
				}
			}

			if(flag==1){
				printf("Good\n");
			}else{
				printf("Bad\n");
			}
		}
		
		T--;
	}

	return 0;
}
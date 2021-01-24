#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,flag;
	char S[101];

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf(" %[^\n]",S);

		for(int i=0;i<strlen(S);i++){
			assert((S[i]>=97 && S[i]<=122) || S[i]==' ');
		}

		flag = 0;

		for(int i=0;S[i]!='\0';i++){
			if((S[i-1]==' ' || i==0) && S[i]=='n' && S[i+1]=='o' && S[i+2]=='t' && (S[i+3]==' ' || S[i+3]=='\0')){
				flag = 1;
				break;
			}
		}

		if(flag==1){
			printf("Real Fancy\n");
		}else{
			printf("regularly fancy\n");
		}

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		char S[100000];
		scanf("%s",S);

		flag = 0;

		for(int i=0;i<strlen(S);i++){
			assert(S[i]=='0' || S[i]=='1');

			if(S[i]=='1' && flag==0){
				flag = 1;
			}else if(S[i]=='1' && flag==2){
				flag = 0;
				break;
			}else if(S[i]=='0' && flag==1){
				flag = 2;
			}
		}

		if(flag==0){
			printf("NO\n");
		}else if(flag==1 || flag==2){
			printf("YES\n");
		}

		T--;
	}
	
	return 0;
}
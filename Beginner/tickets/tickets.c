#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		char S[100];
		scanf("%s",S);

		for(int i=0;i<strlen(S);i++){
			assert(S[i]>=65 && S[i]<=90);
		}

		if(S[0]==S[1]){
			printf("NO\n");
		}else{
			flag = 0;

			for(int i=0;i<strlen(S);i++){
				if(i%2==0){
					if(S[0]!=S[i]){
						flag = 1;
						break;
					}
				}else{
					if(S[1]!=S[i]){
						flag = 1;
						break;
					}
				}
			}

			if(flag==0){
				printf("YES\n");
			}else{
				printf("NO\n");
			}
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,N,dee,dum;
	char S[4],B[51];

	scanf("%d",&T);
	assert(T>=1 && T<=500);

	while(T>0){
		scanf("%d%s",&N,S);

		assert(N>=1 && N<=50);
		assert(S[0]=='D');
		assert(S[1]=='e' || S[1]=='u');
		assert(S[2]=='e' || S[2]=='m');

		dee = 0;
		dum = 0;

		while(N>0){
			scanf("%s",B);

			for(int i=0;i<strlen(B);i++){
				assert(B[i]=='0' || B[i]=='1');
			}

			if(B[0]=='0'){
				for(int i=0;B[i]!='\0';i++){
					if(B[i]=='0'){
						dee++;
					}
				}
			}else{
				for(int i=0;B[i]!='\0';i++){
					if(B[i]=='1'){
						dum++;
					}
				}
			}

			N--;
		}

		if(dee>dum){
			printf("Dee\n");
		}else if(dum>dee){
			printf("Dum\n");
		}else{
			if(strcmp(S,"Dee")==0){
				printf("Dum\n");
			}else{
				printf("Dee\n");
			}
		}

		T--;
	}
	
	return 0;
}
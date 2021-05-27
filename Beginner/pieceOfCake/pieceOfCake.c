#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,max;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		char S[50];
		scanf("%s",S);

		int a[26] = {0};
		max = 0;

		if(strlen(S)%2==1){
			printf("NO\n");
		}else{
			for(int i=0;i<strlen(S);i++){
				if(S[i]>='a' && S[i]<='z'){
					a[S[i]-'a']++;
				}
			}

			for(int i=0;i<26;i++){
				if(max<a[i]){
					max = a[i];
				}
			}

			if(max==strlen(S)/2){
				printf("YES\n");
			}else{
				printf("NO\n");
			}
		}

		T--;
	}
	
	return 0;
}
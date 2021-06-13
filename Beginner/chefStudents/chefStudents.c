#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,c;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		char s[100000];
		scanf("%s",s);

		c = 0;

		for(int i=0;i<strlen(s)-1;i++){
			if(s[i]=='<' && s[i+1]=='>'){
				c++;
			}
		}

		printf("%d\n",c);

		T--;
	}
	
	return 0;
}
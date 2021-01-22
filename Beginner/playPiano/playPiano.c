#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,countA,countB,flag;
	char s[100];

	scanf("%d",&T);
	assert(T>=1 && T<=500);

	while(T>0){
		scanf("%s",s);
		assert(strlen(s)>=2 && strlen(s)%2==0);

		for(int i=0;i<strlen(s);i++){
			assert(s[i]=='A' || s[i]=='B');
		}

		countA = 0;
		countB = 0;
		flag = 0;

		for(int i=0;i<strlen(s);i++){
			if(s[i]=='A'){
				countA++;
			}else{
				countB++;
			}

			if(i%2!=0 && countA!=countB){
				flag = 1;
				break;
			}
		}

		if(flag==0){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}

	return 0;
}
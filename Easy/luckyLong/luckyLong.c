#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,flag;
	char N[100003];

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%s",N);
		flag = 0;

		for(int i=0;i<strlen(N);i++){
			if(N[i]!='4' && N[i]!='7'){
				flag++;
			}
		}

		printf("%d\n",flag);

		T--;
	}
	
	return 0;
}
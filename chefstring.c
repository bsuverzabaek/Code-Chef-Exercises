#include <stdio.h>

int main(void){
	int T;
	printf("Input T: ");
	scanf("%d",&T);

	while(T>0){
		char S[100];
		scanf("%s",S);

		int i = 1;
		int count = 0;
		while(S[i]!='\0'){
			if((S[i-1]=='x' && S[i]=='y') || (S[i-1]=='y' && S[i]=='x')){
				count++;
				S[i] = 'o';
			}
			i++;
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
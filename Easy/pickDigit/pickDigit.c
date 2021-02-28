#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,N,ones,two;
	char S[1000501];

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%s",S);
		assert(strlen(S)>=1);

		int A[10] = {0};
		N = strlen(S);

		for(int i=0;i<N;i++){
			A[S[i]-48]++;
		}

		for(int i=65;i<=90;i++){
			ones = i%10;
			two = i/10;

			if(ones==two && A[ones]>1){
				printf("%c",i);
			}else if(ones!=two && A[ones]!=0 && A[two]!=0){
				printf("%c",i);
			}
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
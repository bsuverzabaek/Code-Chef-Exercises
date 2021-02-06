#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,j,k;
	char M[25000],W[25000];

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%s %s",M,W);

		for(int i=0;i<strlen(M);i++){
			assert(M[i]>=97 && M[i]<=122);
		}

		for(int i=0;i<strlen(W);i++){
			assert(W[i]>=97 && W[i]<=122);
		}

		j = 0;
		k = 0;

		for(int i=0;i<strlen(W);i++){
			if(M[j]==W[i]){
				j++;
			}
		}

		for(int i=0;i<strlen(M);i++){
			if(W[k]==M[i]){
				k++;
			}
		}

		if(j==strlen(M)){
			printf("YES\n");
		}else if(k==strlen(W)){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}

	return 0;
}
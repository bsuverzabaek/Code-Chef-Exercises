#include <stdio.h>
#include <assert.h>
#include <string.h>

int max(int a,int b){
	return (a>b)?a:b;
}

int main(void){
	int T,bal,m;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		char A[100000];
		scanf("%s",A);

		bal = 0;
		m = 0;

		for(int i=0;i<strlen(A);i++){
			if(A[i]=='('){
				bal++;
			}else{
				bal--;
			}

			m = max(m,bal);
		}

		for(int i=0;i<m;i++){
			printf("(");
		}

		for(int i=0;i<m;i++){
			printf(")");
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
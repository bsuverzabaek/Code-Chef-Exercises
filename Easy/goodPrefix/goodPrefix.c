#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,K,X;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	char S[10000];

	while(T>0){
		scanf("%s",S);
		scanf("%d %d",&K,&X);

		for(int i=0;i<strlen(S);i++){
			assert(S[i]>=97 && S[i]<=122);
		}

		assert(K>=0 && K<=10000);
		assert(X>=1 && X<=10000);

		int F[27] = {0};

		if(K==0){
			int i;
			for(i=0;S[i]!='\0';i++){
				F[S[i]-96]++;

				if(F[S[i]-96]>X){
					break;
				}
			}
			printf("%d\n",i);
		}else{
			int i;
			int C = 0;
			int D = 1;
			for(i=0;S[i]!='\0';i++){
				F[S[i]-96]++;

				if(F[S[i]-96]>X){
					K -= (F[S[i]-96]-X);
					F[S[i]-96] = X;
					C++;
				}

				if(K<0){
					C--;
					printf("%d\n",i-C);
					D = 0;
					break;
				}
			}
			if(D==1){
				printf("%d\n",i-C);
			}
		}

		T--;
	}
	
	return 0;
}
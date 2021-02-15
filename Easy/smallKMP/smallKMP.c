#include <stdio.h>
#include <assert.h>

int main(void){
	int T,x,k,flag;
	char S[100000],P[100000];

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%s",S);
		scanf("%s",P);

		int A[26] = {0};
		int B[26] = {0};

		for(int i=0;S[i]!='\0';i++){
			assert(S[i]>=97 && S[i]<=122);
			x = (int)S[i]-97;
			A[x]++;
		}

		k = (int)P[0]-97;

		for(int i=0;P[i]!='\0';i++){
			assert(P[i]>=97 && P[i]<=122);
			x = (int)P[i]-97;
			B[x]++;
		}

		for(int i=0;i<26;i++){
			A[i] -= B[i];
		}

		for(int i=0;i<k;i++){
			for(int j=0;j<A[i];j++){
				printf("%c",(char)i+97);
			}
		}

		for(int i=1;P[i]!='\0';i++){
			if(P[0]>P[i]){
				flag = 1;
				break;
			}

			if(P[0]<P[i]){
				flag = 0;
				break;
			}
		}

		if(flag==1){
			printf("%s",P);
			for(int i=k;i<26;i++){
				for(int j=0;j<A[i];j++){
					printf("%c",(char)i+97);
				}
			}
		}

		if(flag==0){
			for(int j=0;j<A[k];j++){
				printf("%c",(char)k+97);
			}
			printf("%s",P);
			for(int i=k+1;i<26;i++){
				for(int j=0;j<A[i];j++){
					printf("%c",(char)i+97);
				}
			}
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
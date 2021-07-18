#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,W,i;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		char S[10];

		scanf("%d %s",&W,S);
		assert(W>=28 && W<=31);

		int a[] = {4,4,4,4,4,4,4};

		if(strcmp(S,"mon")==0){
			i = 0;
		}else if(strcmp(S,"tues")==0){
			i = 1;
		}else if(strcmp(S,"wed")==0){
			i = 2;
		}else if(strcmp(S,"thurs")==0){
			i = 3;
		}else if(strcmp(S,"fri")==0){
			i = 4;
		}else if(strcmp(S,"sat")==0){
			i = 5;
		}else if(strcmp(S,"sun")==0){
			i = 6;
		}

		for(int j=29;j<=W;j++){
			a[i] += 1;
			i++;

			if(i==7){
				i = 0;
			}
		}

		for(int j=0;j<7;j++){
			printf("%d ",a[j]);
		}
		printf("\n");

		T--;
	}
	
	return 0;
}
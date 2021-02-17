#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,sum,M;
	char N[100005];

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%s",N);
		sum = 0;

		for(int i=0;i<strlen(N);i++){
			sum += (N[i]-'0');
		}

		M = sum%9;

		if((strlen(N)>1 && sum<9) || (M>(9-M))){
			printf("%d\n",9-M);
		}else{
			printf("%d\n",M);
		}

		T--;
	}
	
	return 0;
}
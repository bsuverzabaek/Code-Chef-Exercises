#include <stdio.h>
#include <assert.h>

int main(void){
	int N,count;

	scanf("%d",&N);
	assert(N>=1 && N<=100000);

	char X[N];
	scanf("%s",X);

	count = 0;

	for(int i=N-1;i>=0;i--){
		if(X[i]=='0'){
			count++;
		}else{
			break;
		}
	}

	printf("%d\n",count);
	
	return 0;
}
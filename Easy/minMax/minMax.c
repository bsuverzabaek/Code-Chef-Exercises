#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T;
	long long int N,count;
	char K[100000];

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%lld",&N);
		assert(N>=2 && N<=100000);

		scanf("%s",K);
		count = 0;

		for(int i=0;i<strlen(K);i++){
			count = (count*10+(K[i]-'0'))%N;
		}

		if(count>N-count){
			count = N-count;
		}

		if(count==N-count){
			printf("%lld\n",2*count-1);
		}else{
			printf("%lld\n",2*count);
		}

		T--;
	}
	
	return 0;
}
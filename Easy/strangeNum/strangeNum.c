#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T;
	long long int X,K,count;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%lld %lld",&X,&K);

		assert(X>=1 && X<=1000000000);
		assert(K>=1 && K<=1000000000);

		count = 0;

		while(X%2==0){
			count++;
			X /= 2;
		}

		for(long long int i=3;i<=sqrt(X);i+=2){
			while(X%i==0){
				count++;
				X /= i;
			}
		}

		if(X>2){
			count++;
		}

		if(count>=K){
			printf("1\n");
		}else{
			printf("0\n");
		}

		T--;
	}
	
	return 0;
}
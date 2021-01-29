#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	unsigned long N,a,n;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lu",&N);
		assert(N>=1 && N<=1000000000000000000);

		a = 0;
		n = N;

		while(n!=0){
			a = a+n%10;
			n /= 10;
		}

		for(unsigned long i=0;i<10;i++){
			if((a+i)%10==0){
				printf("%lu%lu\n",N,i);
				break;
			}
		}

		T--;
	}

	return 0;
}
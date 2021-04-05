#include <stdio.h>
#include <assert.h>

long long int gcd(long long int C,long long int D){
	if(D==0){
		return C;
	}

	return gcd(D,C%D);
}

int main(void){
	int T;
	long long int A,B,C,D,g,diff;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){
		scanf("%lld %lld %lld %lld",&A,&B,&C,&D);

		assert(A>=1 && A<=100000000000000);
		assert(B>=1 && B<=100000000000000);
		assert(C>=1 && C<=100000000000000);
		assert(D>=1 && D<=100000000000000);

		g = gcd(C,D);
		diff = A-B;

		if(diff<0){
			diff = B-A;
		}

		diff %= g;

		if(g-diff<diff){
			diff = g-diff;
		}

		printf("%lld\n",diff);

		T--;
	}
	
	return 0;
}
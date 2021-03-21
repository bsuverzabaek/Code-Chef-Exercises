#include <stdio.h>
#include <assert.h>

long long int F(long long int X){
	if(X%9==0){
		return 9;
	}else{
		return X%9;
	}
}

int main(void){
	int T;
	long long int A,D,R,L,sum,K;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld %lld %lld %lld",&A,&D,&L,&R);

		assert(A>=1 && A<=1000000000);
		assert(D>=0 && D<=1000000000);
		assert(L>=1 && L<=R);
		assert(R>=1 && R<=1000000000000000000);

		A = F(A);
		D = F(D);
		K = (R-L+1)/9;

		sum = 0;

		for(long long int i=0;i<9;i++){
			sum += F(A+i*D);
		}

		sum *= K;

		for(long long int i=L;i<=R-(K*9);i++){
			sum += F(A+(i-1)*D);
		}

		printf("%lld\n",sum);

		T--;
	}
	
	return 0;
}
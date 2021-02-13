#include <stdio.h>
#include <assert.h>

long long int totalSum(long long int min,long long int max){
	return ((max*(max+1))/2) - ((min*(min-1))/2);
}

int main(void){
	int T,N;
	long long int A,sum,min,nextMin,max,nextMax;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=3 && N<=100000);

		sum = 0;
		min = 1000000001;
		nextMin = 1000000001;
		max = 0;
		nextMax = 0;

		while(N>0){
			scanf("%lld",&A);
			assert(A>=1 && A<=1000000000);

			sum += A;

			if(min>A){
				nextMin = min;
				min = A;
			}else if(nextMin>A){
				nextMin = A;
			}

			if(max<A){
				nextMax = max;
				max = A;
			}else if(nextMax<A){
				nextMax = A;
			}

			N--;
		}

		if((sum-totalSum(nextMin,max))==min){
			printf("%lld\n",min);
		}else if((sum-totalSum(min,nextMax))==max){
			printf("%lld\n",max);
		}else{
			printf("%lld\n",sum-totalSum(min,max));
		}

		T--;
	}
	
	return 0;
}
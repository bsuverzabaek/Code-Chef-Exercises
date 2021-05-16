#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	if(((*(long long int*)(a))-(*(long long int*)(b)))>0){
		return 1;
	}else{
		return -1;
	}
}

int main(void){
	long long int N,X,total,failed,successful;

	scanf("%lld %lld",&N,&X);

	assert(N>=1 && N<=1000000);
	assert(X>=0 && X<=1000000000000000);

	long long int A[N];

	for(long long int i=0;i<N;i++){
		scanf("%lld",&A[i]);
		assert(A[i]>=1 && A[i]<=1000000000);
	}

	qsort(A,N,sizeof(long long int),compare);

	total = 0;
	failed = N;
	successful = 0;

	for(long long int i=0;i<N;i++){
		if(A[i]%2!=0){
			total += A[i]/2+1;
		}else{
			total += A[i]/2;
		}

		if(total>X){
			if(A[i]%2!=0){
				total -= A[i]/2+1;
			}else{
				total -= A[i]/2;
			}

			break;
		}

		if(A[i]==1){
			successful++;
		}

		failed--;
	}

	for(long long int i=0;i<N;i++){
		if(!(A[i]==1)){
			total += A[i]/2;

			if(total>X){
				break;
			}

			successful++;
		}
	}

	printf("%lld %lld\n",failed,successful);
	
	return 0;
}
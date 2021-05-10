#include <stdio.h>
#include <assert.h>

int findMin(int n){
	int first,last;

	if(n==0){
		return 0;
	}else{
		if((n&1)!=0){
			first = n/2;
			last = n/2;
		}else{
			first = n/2-1;
			last = n/2;
		}

		return ((n+1)+findMin(first)+findMin(last));
	}
}

int main(void){
	int T,N,M,min,max;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=30);
		assert(M>=1 && M<=1000);

		min = findMin(N);
		max = N*(N+3)/2;

		if(M<min){
			printf("-1\n");
		}else if(M>max){
			printf("%d\n",M-max);
		}else{
			printf("0\n");
		}

		T--;
	}
	
	return 0;
}
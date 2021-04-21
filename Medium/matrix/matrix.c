#include <stdio.h>
#include <assert.h>

short min(short a,short b){
	return (a<b?a:b);
}

int main(void){
	int M,N;
	char c;
	long long int sum;

	scanf("%d %d",&N,&M);

	assert(N>=1 && N<=2000);
	assert(M>=1 && M<=2000);

	short A[2001][2001];
	sum = 0;

	for(int i=0;i<N;i++){
		for(int j=0;j<M;j++){
			scanf(" %c",&c);
			assert(c=='0' || c=='1');

			A[i][j] = c-'0';

			if(i!=0 && j!=0){
				if(A[i][j]==1){
					A[i][j] += min(A[i-1][j],A[i-1][j-1]);
				}
			}

			sum += A[i][j];
		}
	}

	printf("%lld\n",sum);
	
	return 0;
}
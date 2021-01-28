#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,A[1000001];
	long long int a;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	a = 1;
	A[0] = 1;

	for(int i=1;i<1000001;i++){
		a = (a*(i+1)) % 1000000007;
		A[i] = (int)a - 1;
	}

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000000);

		printf("%d\n",A[N]);

		T--;
	}

	return 0;
}
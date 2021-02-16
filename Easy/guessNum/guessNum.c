#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int A,M,D,k;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%lld %lld",&A,&M);

		assert(M>=2 && M<=10000000000);
		assert(A>=1 && A<M);

		k = 0;
		long long int B[1000000] = {0};

		for(long long int i=M/A;i>0;i--){
			D = M-A*i;

			if(D>i){
				break;
			}else if(D!=0){
				if(i%D==0){
					B[k++] = i;
				}
			}
		}

		printf("%lld\n",k);

		for(long long int i=k-1;i>=0;i--){
			printf("%lld ",B[i]);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
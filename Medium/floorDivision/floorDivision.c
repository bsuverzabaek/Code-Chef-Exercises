#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N;
	long long int x,d;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	int A[12] = {0,1,2,2,3,3,0};

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		d = 0;

		for(int i=0;i<N;i++){
			scanf("%lld",&x);
			assert(x>=1 && x<=1000000000000000000);

			while(x>11){
				x /= 12;
			}

			d ^= A[x];
		}

		if(d!=0){
			printf("Henry\n");
		}else{
			printf("Derek\n");
		}

		T--;
	}
	
	return 0;
}
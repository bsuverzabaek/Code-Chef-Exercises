#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,max,min,a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=74);

	while(T>0){
		scanf("%d",&N);
		assert(N>=3 && N<=19);

		int A[N];

		max = 0;
		min = 10000;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=109);

			if(min>A[i]){
				min = A[i];
				a = i;
			}
			if(max<A[i]){
				max = A[i];
				b = i;
			}
		}

		if(a<b){
			printf("%d %d\n",min,max);
		}else{
			printf("%d %d\n",max,min);
		}

		T--;
	}

	return 0;
}
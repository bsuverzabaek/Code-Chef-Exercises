#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=20);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=40000);

		int A[N];
		a = 0;
		b = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=0 && A[i]<=1000000000);

			if(A[i]==0){
				b++;
			}
			if(A[i]==2){
				a++;
			}
		}

		printf("%d\n",((b-1)*b/2+(a-1)*a)/2);

		T--;
	}

	return 0;
}
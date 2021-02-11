#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M;
	int j,m1,m2;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	int sumN = 0;
	int sumM = 0;

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=2 && N<=100000);
		assert(M>=2 && M<=100000);

		sumN += N;
		sumM += M;

		if(T==1){
			assert(sumN<=1000000);
			assert(sumM<=1000000);
		}

		int D[N];
		int V[N];

		for(int i=0;i<N;i++){
			scanf("%d %d",&D[i],&V[i]);

			assert(D[i]>=1 && D[i]<=M);
			assert(V[i]>=1 && V[i]<=1000000000);
		}

		m1 = 0;
		m2 = 0;

		for(int i=0;i<N;i++){
			if(V[i]>m1){
				m1 = V[i];
				j = i;
			}
		}

		V[j] = 0;

		for(int i=0;i<N;i++){
			if(V[i]>m2 && D[i]!=D[j]){
				m2 = V[i];
			}
		}

		printf("%d\n",m1+m2);

		T--;
	}
	
	return 0;
}
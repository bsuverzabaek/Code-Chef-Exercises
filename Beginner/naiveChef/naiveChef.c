#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,A,B,r1,r2;
	double flag;

	scanf("%d",&T);
	assert(T>=1 && T<=70);

	while(T>0){
		scanf("%d %d %d",&N,&A,&B);

		assert(N>=1 && N<=10000);
		assert(A>=1 && A<=N);
		assert(B>=1 && B<=N);

		int x[N];
		r1 = 0;
		r2 = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&x[i]);
			assert(x[i]>=1 && x[i]<=N);

			if(x[i]==A){
				r1++;
			}

			if(x[i]==B){
				r2++;
			}
		}

		flag = ((double)r1/N)*((double)r2/N);
		printf("%.10lf\n",flag);

		T--;
	}
	
	return 0;
}
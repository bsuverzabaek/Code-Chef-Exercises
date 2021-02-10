#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,ans;
	float D,U,M,R,C,min;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%f %f %d",&D,&U,&N);

		assert(D>=0.5 && D<=10.0);
		assert(U>=1 && U<=10000);
		assert(N>=1 && N<=100);

		min = D*U;
		ans = 0;

		for(int i=0;i<N;i++){
			scanf("%f %f %f",&M,&R,&C);

			assert(M>=1 && M<=36);
			assert(R>=0.05 && R<D);
			assert(C>=1 && C<=1000);

			if((C/M)+(R*U)<min){
				min = (C/M)+(R*U);
				ans = i+1;
			}	
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
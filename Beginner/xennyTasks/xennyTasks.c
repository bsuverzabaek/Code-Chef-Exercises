#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=20000);

		int X[N];
		int Y[N];

		a = 0;
		b = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&X[i]);
			assert(X[i]>=1 && X[i]<=100000);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&Y[i]);
			assert(Y[i]>=1 && Y[i]<=100000);

			if(i%2==0){
				a += X[i];
				b += Y[i];
			}else{
				a += Y[i];
				b += X[i];
			}
		}

		if(a<b){
			printf("%d\n",a);
		}else{
			printf("%d\n",b);
		}

		T--;
	}
	
	return 0;
}
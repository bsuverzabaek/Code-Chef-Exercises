#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,M,sumN,sumM;
	int minM,maxM,x;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){
		scanf("%d %d",&N,&M);

		sumN = 0;
		sumM = 0;

		assert(N>=1 && N<=100000);
		assert(M>=1 && M<=100000);

		sumN += N;
		sumM += M;

		if(T==1){
			assert(sumN>=1 && sumN<=100000);
			assert(sumM>=1 && sumM<=100000);
		}

		minM = 1111111;
		maxM = -1111111;

		while(M>0){
			scanf("%d",&x);

			minM = min(x,minM);
			maxM = max(x,maxM);

			M--;
		}

		for(int i=0;i<N;i++){
			printf("%d ",max(abs(i-minM),abs(i-maxM)));
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,K,E,M;
	int tot,score,x,y,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		scanf("%d %d %d %d",&N,&K,&E,&M);

		assert(K>=1 && K<N && N>K && N<=10000);
		assert(M>=1 && M<=1000000000);
		assert(E>=1 && E<=4);

		int totals[N-1];

		for(int i=0;i<N-1;i++){
			tot = 0;
			for(int j=0;j<E;j++){
				scanf("%d",&score);
				assert(score>=1 && score<=M);
				tot += score;
			}
			totals[i] = tot;
		}

		qsort(totals,N-1,sizeof(int),compare);
		x = totals[1];
		y = 0;

		for(int i=0;i<E-1;i++){
			scanf("%d",&score);
			assert(score>=1 && score<=M);
			y += score;
		}

		if(max(0,x-y+1)>M){
			printf("Impossible\n");
		}else{
			printf("%d\n",max(0,x-y+1));
		}

		T--;
	}

	return 0;
}
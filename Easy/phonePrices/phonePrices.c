#include <stdio.h>
#include <assert.h>
#include <stdbool.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,count;
	bool good;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=7 && N<=100);

		int P[N];
		count = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&P[i]);
			assert(P[i]>=350 && P[i]<=750);

			good = true;

			for(int j=max(i-5,0);j<i;j++){
				good = good && P[i]<P[j];	
			}

			if(good==true){
				count++;
			}
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}
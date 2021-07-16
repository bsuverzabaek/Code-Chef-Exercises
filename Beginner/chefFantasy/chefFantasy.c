#include <stdio.h>
#include <assert.h>

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,S,def,up;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&S);

		assert(N>=1 && N<=100);
		assert(S>=13 && S<=100);

		int P[N];
		int c[N];

		for(int i=0;i<N;i++){
			scanf("%d",&P[i]);
			assert(P[i]>=1 && P[i]<=100);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&c[i]);
		}

		def = 1000;
		up = 1000;

		for(int i=0;i<N;i++){
			if(c[i]==0){
				def = min(def,P[i]);
			}else if(c[i]==1){
				up = min(up,P[i]);
			}
		}

		if((S+up+def)>100){
			printf("no\n");
		}else{
			printf("yes\n");
		}

		T--;
	}
	
	return 0;
}
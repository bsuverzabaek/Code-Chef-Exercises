#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int L[N];
		int G[N];

		for(int i=0;i<N;i++){
			scanf("%d",&L[i]);
			assert(L[i]>=1 && L[i]<=1000000000);
		}

		for(int i=0;i<N;i++){
			scanf("%d",&G[i]);
			assert(G[i]>=1 && G[i]<=1000000000);
		}

		a = 0;
		b = 0;

		for(int i=0;i<N;i++){
			if(L[i]<=G[i]){
				a++;
			}

			if(L[N-i-1]<=G[i]){
				b++;
			}
		}

		if(a==N && b==N){
			printf("both\n");
		}else if(a!=N && b==N){
			printf("back\n");
		}else if(a==N && b!=N){
			printf("front\n");
		}else if(a!=N && b!=N){
			printf("none\n");
		}

		T--;
	}
	
	return 0;
}
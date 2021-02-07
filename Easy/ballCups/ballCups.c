#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,C,Q,L,R;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d %d",&N,&C,&Q);

		assert(N>=1 && N<=100000);
		assert(C>=1 && C<=N);
		assert(Q>=1 && Q<=10000);

		while(Q>0){
			scanf("%d %d",&L,&R);
			assert(L>=1 && L<=R && R<=N);

			if(L<=C && C<=R){
				C = L+R-C;
			}

			Q--;
		}

		printf("%d\n",C);

		T--;
	}

	return 0;
}
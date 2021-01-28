#include <stdio.h>
#include <assert.h>

int main(void){
	int T,D,Q;
	int d,p,dead,req;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&D);
		assert(D>=1 && D<=31);

		int A[32] = {0};

		while(D>0){
			scanf("%d %d",&d,&p);
			assert(d>=1 && d<=31);
			assert(p>=1 && p<=100);

			A[d] = p;

			D--;
		}

		for(int i=1;i<32;i++){
			A[i] += A[i-1];
		}

		scanf("%d",&Q);
		assert(Q>=1 && Q<=100);

		while(Q>0){
			scanf("%d %d",&dead,&req);
			assert(dead>=1 && dead<=31);
			assert(req>=1 && req<=5000);

			if(A[dead]>=req){
				printf("Go Camp\n");
			}else{
				printf("Go Sleep\n");
			}

			Q--;
		}

		T--;
	}

	return 0;
}
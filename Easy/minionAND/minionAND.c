#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,Q,L,R,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=100000);
		}

		scanf("%d",&Q);
		assert(Q>=1 && Q<=100000);

		while(Q>0){
			scanf("%d %d",&L,&R);
			flag = 0;

			L--;
			R--;

			for(int i=L;i<=R;i++){
				if(A[i]%2==0){
					flag = 1;
					break;
				}
			}

			if(flag==1){
				printf("EVEN\n");
			}else{
				printf("ODD\n");
			}

			Q--;
		}

		T--;
	}
	
	return 0;
}
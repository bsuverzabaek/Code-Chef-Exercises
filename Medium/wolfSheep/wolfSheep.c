#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M,x,y,count;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=10);
		assert(M>=0 && M<=20);

		int A[N+1];

		for(int i=0;i<=N;i++){
			A[i] = 0;
		}

		for(int i=0;i<M;i++){
			scanf("%d %d",&x,&y);
			
			A[x]++;
			A[y]++;
		}

		count = 0;

		if(M<2){
			printf("YES\n");
		}else if(M==2){
			for(int i=1;i<=N;i++){
				if(A[i]==2){
					count++;
				}
			}

			if(count==1){
				printf("YES\n");
			}else{
				printf("NO\n");
			}
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}
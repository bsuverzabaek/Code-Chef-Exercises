#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,sumN,z;

	scanf("%d",&T);
	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);
		sumN += N;

		if(T==1){
			assert(sumN<=1000000);
		}

		if(N==1){
			printf("1\n");
		}else if((N&-N)==N){
			printf("-1\n");
		}else{
			int ans[100000] = {2,3,1};
			z = 3;

			for(int i=4;i<=N;i++){
				ans[z] = i;
				z++;
			}

			for(int i=3;i<N;i++){
				if((ans[i]&ans[i-1])==0){
					int t = ans[i+1];
					ans[i+1] = ans[i];
					ans[i] = t;
				}
			}

			for(int i=0;i<N;i++){
				printf("%d ",ans[i]);
			}

			printf("\n");
		}

		T--;
	}

	return 0;
}
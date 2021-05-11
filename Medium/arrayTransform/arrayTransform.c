#include <stdio.h>
#include <assert.h>

int main(void){
	int T,n,K,rem1,rem2,remCount1,remCount2;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&n,&K);

		assert(n>=2 && n<=100);
		assert(K>=1 && K<=10);

		int A[n];

		for(int i=0;i<n;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=0 && A[i]<=1000);
		}

		if(n==2){
			printf("YES\n");
		}else{
			rem1 = A[0]%(K+1);
			rem2 = -1;
			remCount1 = 1;
			remCount2 = 0;

			int i;

			for(i=1;i<n;i++){
				if(A[i]%(K+1)!=rem1){
					if(rem2!=-1){
						if(A[i]%(K+1)==rem2){
							remCount2++;
						}else{
							break;
						}
					}else{
						rem2 = A[i]%(K+1);
						remCount2 = 1;
					}
				}else{
					remCount1++;
				}
			}

			if(i<n){
				printf("NO\n");
			}else{
				if(remCount1==n-1 || remCount2==n-1 || remCount1==n){
					printf("YES\n");
				}else{
					printf("NO\n");
				}
			}
		}

		T--;
	}
	
	return 0;
}
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
	int T,N,X,sumN,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);
		sumN += N;

		if(T==1){
			assert(sumN>=1 && sumN<=1000000);
		}

		int A[4] = {0};

		for(int i=0;i<N;i++){
			scanf("%d",&X);
			assert(X>=0 && X<=1000000000);
			A[X%4] += 1;
		}

		if((A[1]+2*A[2]+3*A[3])%4==0){
			ans = min(A[1],A[3]);

			A[1] -= ans;
			A[3] -= ans;
			
			ans += A[2]/2;
			A[2] %= 2;

			if(A[2]!=0){
				ans += 2;
				A[2] = 0;

				if(A[3]!=0){
					A[3] -= 2;
				}

				if(A[1]!=0){
					A[1] -= 2;
				}
			}

			if(A[1]!=0){
				ans += (A[1]/4)*3;
			}

			if(A[3]!=0){
				ans += (A[3]/4)*3;
			}

			printf("%d\n",ans);
		}else{
			printf("-1\n");
		}

		T--;
	}
	
	return 0;
}
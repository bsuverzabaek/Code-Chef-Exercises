#include <stdio.h>
#include <assert.h>

int gcd(int a,int b){
	if(b==0){
		return a;
	}

	return gcd(b,a%b);
}

int main(void){
	int T,N,res,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100000);

		int A[N];
		ans = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=100000);
		}

		res = A[0];

		for(int i=1;i<N;i++){
			res = gcd(res,A[i]);

			if(res==1){
				ans = N;
				break;
			}
		}

		if(ans!=0){
			printf("%d\n",N);
		}else{
			printf("-1\n");
		}

		T--;
	}
	
	return 0;
}
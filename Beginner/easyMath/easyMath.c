#include <stdio.h>
#include <assert.h>

int sumDig(int N){
	int sum = 0;

	while(N>0){
		sum += N%10;
		N /= 10;
	}

	return sum;
}

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,prod,sum,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=100);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=10000);
		}

		ans = 0;

		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				prod = A[i] * A[j];
				sum = sumDig(prod);
				ans = max(ans,sum);
			}
		}

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
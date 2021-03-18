#include <stdio.h>
#include <assert.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,tot,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[100001];
		int count[100001] = {0};
		int factors[100001] = {0};


		for(int i=1;i<=N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=100000);
			count[A[i]]++;
		}

		ans = 0;

		for(int i=2;i<100001;i++){
			if(factors[i]==0){
				for(int j=i;j<100001;j+=i){
					factors[j]++;
				}
			}

			tot = 0;

			for(int j=i;j<100001;j+=i){
				tot += count[j];
			}

			ans = max(ans,tot*factors[i]);
		}

		printf("%d\n",ans);


		T--;
	}
	
	return 0;
}
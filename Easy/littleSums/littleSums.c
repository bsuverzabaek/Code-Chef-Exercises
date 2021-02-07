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
	int T,N,m;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];
		m = 100000;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=100000);
			m = min(m,A[i]);
		}

		for(int i=0;i<N;i++){
			if(A[i]==m){
				printf("%d\n",i+1);
				break;
			}
		}

		T--;
	}
	
	return 0;
}
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
	int T,N,K,state,ans;
	char C[100001];

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=100000);
		assert(K>=1 && K<=100000);

		scanf("%s",C);

		int B[100001] = {0};
		state = 0;
		ans = 0;

		for(int i=0;i<N;i++){
			assert(C[i]=='G' || C[i]=='R');

			if(B[i]!=0){
				state = 1-state;
			}

			if((state==0 && C[i]=='R') || (state==1 && C[i]=='G')){
				B[min(N,i+K)] = 1;
				ans++;
				state = 1-state;
			}
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
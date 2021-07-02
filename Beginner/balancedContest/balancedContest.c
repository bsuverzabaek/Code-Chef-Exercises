#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,P,s,r,easy,hard;

	scanf("%d",&T);
	assert(T>=1 && T<=500);

	while(T>0){
		scanf("%d %d",&N,&P);

		assert(N>=1 && N<=500);
		assert(P>=1 && P<=100000000);

		int a[N];

		s = P/2;
		r = P/10;
		easy = 0;
		hard = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&a[i]);
			assert(a[i]>=1 && a[i]<=P);

			if(a[i]>=s){
				easy++;
			}else if(a[i]<=r){
				hard++;
			}
		}

		if(hard==2 && easy==1){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}

	return 0;
}
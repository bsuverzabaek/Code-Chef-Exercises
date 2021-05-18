#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,ans,p;
	int a[200000];
	int val[1000];
	int mark[1000] = {0};
	
	a[0] = 0;

	for(int i=0;i<6;i++){
		val[i] = i+1;

		for(int j=0;j<i;j++){
			val[i] *= (i+1);
		}
	}

	for(int i=1;i<=105000;i++){
		for(int j=0;j<6;j++){
			if(i>=val[j]){
				mark[a[i-val[j]]] = 1;
			}
		}

		for(int j=0;j<=6;j++){
			if(mark[j]==0){
				a[i] = j;
				break;
			}
		}

		for(int j=0;j<=6;j++){
			mark[j] = 0;
		}
	}

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		ans = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&p);
			assert(p>=1 && p<=100000);
			ans ^= a[p];
		}

		if(ans!=0){
			printf("Little Chef\n");
		}else{
			printf("Head Chef\n");
		}

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,min;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		int a[N];
		min = 100001;

		for(int i=0;i<N;i++){
			scanf("%d",&a[i]);
			assert(a[i]>=1 && a[i]<=100000);

			if(min>a[i]){
				min = a[i];
			}
		}

		printf("%d\n",min);

		T--;
	}
	
	return 0;
}
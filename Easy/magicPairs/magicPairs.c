#include <stdio.h>
#include <assert.h>

int main(void){
	int T,n,d;

	scanf("%d",&T);
	assert(T>=1 && T<=4);

	while(T>0){
		scanf("%d",&n);
		assert(n>=1 && n<=100000);

		int a[n];

		for(int i=0;i<n;i++){
			scanf("%d",&a[i]);
			assert(a[i]>=0 && a[i]<=1000000000);
		}

		d = (((n-1)*n)/2);
		printf("%d\n",d);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,m,n,count;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&n,&m);

		assert(n>=1 && n<=30);
		assert(m>=1 && m<=1000);

		int a[n];
		count = 0;

		for(int i=0;i<n;i++){
			scanf("%d",&a[i]);
			assert(a[i]>=1 && a[i]<=1000);

			if(a[i]%m==0){
				count++;
			}
		}

		printf("%d\n",(1 << count) - 1);

		T--;
	}

	return 0;
}
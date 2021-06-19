#include <stdio.h>
#include <assert.h>

int main(void){
	int T,n,k,even;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&n,&k);

		assert(n>=1 && n<=50);
		assert(k>=0 && k<=n);

		int a[n];
		even = 0;

		for(int i=0;i<n;i++){
			scanf("%d",&a[i]);
			assert(a[i]>=1 && a[i]<=100);

			if(a[i]%2==0){
				even++;
			}
		}

		if(even==n && k==0){
			printf("NO\n");
		}else if(even>=k){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}
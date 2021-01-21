#include <stdio.h>
#include <assert.h>

int main(void){
	int T,n,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){

		scanf("%d",&n);
		assert(n>=1 && n<=50);

		int count[51] = {0};

		for(int i=0,d;i<n;i++){
			scanf("%d",&d);
			assert(d>=1 && d<=100);
			count[d]++;
		}

		ans = 0;

		for(int i=0;i<51;i++){
			if(count[i]>0){
				ans++;
			}
		}

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <assert.h>

int max(int a,int b){
	return (a>b)?a:b;
}

int main(void){
	int N,low,high,ans,x,m;
	int a[100001];

	scanf("%d",&N);
	assert(N>=1 && N<=100000);

	ans = 0;

	for(int i=0;i<N;i++){
		low = 0;
		high = ans-1;

		scanf("%d",&x);
		assert(x>=1 && x<=100000);

		while(low<=high){
			m = (low+high)/2;

			if(a[m]<=x){
				high = m-1;
			}else{
				low = m+1;
			}
		}

		a[low] = x;
		ans = max(ans,low+1);
	}

	printf("%d\n",ans);
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,F,x,y,z;
	long long int ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		ans = 0;

		scanf("%d %d",&N,&F);

		assert(N>=1 && N<=10000);
		assert(F>=2 && F<=1000000000);

		int h[N];

		for(int i=0;i<N;i++){
			scanf("%d",&x);
			assert(x>=1 && x<=1000000000);

			while(x%F==0){
				x /= F;
			}

			h[i] = x;
		}

		qsort(h,N,sizeof(int),compare);

		y = h[0];
		z = 1;

		for(int i=1;i<N;i++){
			if(h[i]!=y){
				y = h[i];
				z = 0;
			}

			ans += z;
			z++;
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
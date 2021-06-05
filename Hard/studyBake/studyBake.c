#include <stdio.h>
#include <assert.h>

int main(void){
	int T,n,sumN,index,target;
	double tanV,greed;

	scanf("%d",&T);
	sumN = 0;

	while(T>0){
		scanf("%d",&n);
		assert(n>=1 && n<=100000);

		sumN += n;
		assert(sumN<=500000);

		int x[n];
		int h[n];
		int ans[n];

		for(int i=0;i<n;i++){
			scanf("%d %d",&x[i],&h[i]);
			assert(x[i]>=1 && x[i]<=1000000);
			assert(h[i]>=1 && h[i]<=1000000);
			ans[i] = -2;
		}

		for(int i=0;i<n-1;i++){
			assert(x[i]<x[i+1]);
		}

		for(int i=n-2;i>=0;i--){
			if(h[i]<=h[i+1]){
				continue;
			}

			ans[i] = i+1;
			tanV = (double)(h[i+1]-h[i])/(x[i]-x[i+1]);
			index = i+1;

			for(int j=i+1;j<n;j++){
				target = ans[index];

				if(target==-2){
					target = index+1;
				}

				if(target>=n || h[target]>=h[i]){
					break;
				}

				index = target;
				greed = (double)(h[target]-h[i])/(x[i]-x[target]);

				if(tanV>=greed){
					ans[i] = target;
					tanV = greed;
				}
			}
		}

		for(int i=0;i<n;i++){
			printf("%d ",ans[i]+1);
		}
		printf("\n");

		T--;
	}
	
	return 0;
}
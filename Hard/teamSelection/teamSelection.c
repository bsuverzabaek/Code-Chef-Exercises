#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int main(void){
	int T,N,curSum,ans,bestDiff;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		ans = 0;
		curSum = 0;

		int ele[N];
		int sum[450002];

		for(int i=0;i<N;i++){
			scanf("%d",&ele[i]);
			assert(ele[i]>=1 && ele[i]<=450);

			curSum += ele[i];

			if((i&1)!=0){
				ans += ele[i];
			}
		}

		for(int i=0;i<=curSum;i++){
			sum[i] = 0;
		}

		sum[0] = 1;
		curSum = 0;

		for(int i=0;i<N;i++){
			for(int j=curSum+ele[i];j>=ele[i];j--){
				sum[j] |= (sum[j-ele[i]]<<1);
			}

			curSum += ele[i];
		}

		bestDiff = abs(curSum-2*ans);

		for(int i=0;i<=curSum;i++){
			if((sum[i]&(1<<(N/2)))!=0 || (sum[i]&(1<<(N-N/2)))!=0){
				if(bestDiff>abs(curSum-2*i)){
					ans = i;
					bestDiff = abs(curSum-2*i);
				}
			}
		}

		if(ans>curSum-ans){
			ans = curSum-ans;
		}

		printf("%d %d\n",ans,curSum-ans);

		T--;
	}
	
	return 0;
}
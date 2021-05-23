#include <stdio.h>
#include <assert.h>

int main(void){
	int N,val,ans,mRange;

	int count[30003] = {0};
	int dist[30003] = {0};

	scanf("%d",&N);
	assert(N>=3 && N<=100000);

	ans = 0;

	for(int i=0;i<N;i++){
		scanf("%d",&val);
		assert(val>=1 && val<=30000);

		count[val]++;
		ans += dist[val];

		if(val<15001){
			mRange = val;
		}else{
			mRange = 30002-val;
		}

		for(int j=1;j<=mRange;j++){
			dist[val+j] += count[val-j];
			dist[val-j] += count[val+j];
		}
	}

	for(int i=0;i<30003;i++){
		ans += (count[i]*(count[i]-1)*(count[i]-2))/6;
	}

	printf("%d\n",ans);
	
	return 0;
}
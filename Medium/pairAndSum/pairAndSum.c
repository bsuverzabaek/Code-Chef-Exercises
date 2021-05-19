#include <stdio.h>
#include <assert.h>

long long int choose2(int n){
	long long int r;
	r = n;
	return (r*(r-1))>>1;
}

int main(void){
	int N,x;
	long long int r,m;

	scanf("%d",&N);
	assert(N<=100000);

	int bitCounts[32] = {0};

	for(int i=0;i<N;i++){
		scanf("%d",&x);
		assert(x<=1000000000);

		for(int j=0;j<32;j++){
			if((x&1)!=0){
				bitCounts[j]++;
			}
			x >>= 1;
		}
	}

	r = 0;
	m = 0;

	for(int i=0;i<32;i++){
		r += choose2(bitCounts[i])<<m;
		m++;
	}

	printf("%lld\n",r);
	
	return 0;
}
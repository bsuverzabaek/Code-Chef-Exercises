#include <stdio.h>
#include <assert.h>
#define mod 1000000007

int binCount(int a,int b,int m){
	int res = 1;

	while(b!=0){
		if((b&1)!=0){
			res = (res*a)%m;
		}

		a = (a*a)%m;
		b >>= 1;
	}

	return res;
}

int main(void){
	int T,N,x,max1,p1,p2,count,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=30);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		max1 = -1;
		ans = 1;
		int A[100000] = {0};
		int S[100000] = {0};

		for(int i=0;i<N;i++){
			scanf("%d",&x);
			assert(x>=1 && x<=100000);
			A[x]++;

			if(x>max1){
				max1 = x;
			}
		}

		for(int i=max1;i>1;i--){
			p1 = A[i];
			p2 = 0;

			for(int j=2;(i*j)<=max1;j++){
				p1 += A[i*j];
				p2 = (p2+S[i*j])%(mod-1);
			}

			count = (binCount(2,p1,mod-1)-1-p2+mod-1)%(mod-1);
			ans = (ans*binCount(i,count,mod))%mod;
			S[i] = count;
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>
#define MOD 1000000007

long long int powMod(int x,int n,int m){
	if(n==0){
		return 1;
	}else{
		long long int p = powMod(x,n/2,m);

		if((n&1)!=0){
			return (((p*p)%m)*x)%m;
		}else{
			return (p*p)%m;
		}
	}
}

long long int noSol(int x,int u,int N){
	if(u%N>=x){
		return u/N+1;
	}else{
		return u/N;
	}
}

int main(void){
	int T,upper,d,m,N;
	long long int ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d %d %d",&upper,&d,&m,&N);

		assert(upper>=1 && upper<=1000000000);
		assert(d>=0 && d<=1000000000);
		assert(m>=0 && m<N);
		assert(N>=1 && N<=40);

		long long int A[N];

		for(int i=0;i<N;i++){
			if(i==0 && d==0){
				A[i] = 1;
			}else if(i==0 || i==1){
				A[i] = i;
			}else{
				A[i] = powMod(i,d,N);
			}
		}

		ans = 0;

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				for(int k=0;k<N;k++){
					if((A[i]+A[j]+A[k])%N==m){
						ans = (ans + (((noSol(i,upper,N)*noSol(j,upper,N))%MOD)*noSol(k,upper,N))%MOD)%MOD;
					}
				}
			}
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
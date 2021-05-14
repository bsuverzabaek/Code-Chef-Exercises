#include <stdio.h>
#include <assert.h>
#include <math.h>

long long int gcd(long long int a,long long int b){
	while(b!=0){
		long long int mod = a%b;
		a = b;
		b = mod;
	}

	return a;
}

int main(void){
	int T,N,foundAns;
	long long int x,ans,g,div,s;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100);

		long long int A[N];

		for(int i=0;i<N;i++){
			scanf("%lld",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000000000000);
		}

		foundAns = 0;
		ans = -1;

		for(int i=0;i<N-1;i++){
			for(int j=i+1;j<N;j++){
				g = gcd(A[i],A[j]);

				if(g>1){
					ans = g;
					foundAns = 1;
					break;
				}
			}

			if(foundAns!=0){
				break;
			}
		}

		for(int i=0;i<N;i++){
			for(x=1;(x*x*x)<=A[i];x++){
				if(x>1 && A[i]%(x*x)==0){
					ans = x;
					foundAns = 1;
					break;
				}

				if(A[i]%x==0){
					div = A[i]/x;
					s = (long long int)sqrtl(div) + 1E-6;

					if(s>1 && (s*s)==div){
						ans = s;
						foundAns = 1;
						break;
					}
				}
			}

			if(foundAns!=0){
				break;
			}
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
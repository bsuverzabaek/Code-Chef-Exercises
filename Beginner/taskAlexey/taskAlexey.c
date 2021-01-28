#include <stdio.h>
#include <assert.h>

int gcd(int A,int B){
	if(A==0){
		return B;
	}else if(B==0){
		return A;
	}else{
		int rem = A%B;
		A = B;
		B = rem;
		return gcd(A,B);
	}
}

int lcm(int A,int B){
	int ans;
	int gcf = gcd(A,B);

	if(A%gcf==0){
		ans = A/gcf;
		ans *= B;
		return ans;
	}else{
		ans = B/gcf;
		ans *= A;
		return ans;
	}
}

int main(void){
	int T,N,min;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=2 && N<=500);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=1000000000);
		}

		min = 1000000000;

		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				if(A[i]*A[j]/gcd(A[i],A[j])<min){
					min = A[i]*A[j]/gcd(A[i],A[j]);
				}
			}
		}

		printf("%d\n",min);

		T--;
	}

	return 0;
}
#include <stdio.h>
#include <assert.h>
#include <stdbool.h>

int main(void){
	long long int S[100009] = {0};
	long long int pSum[100009] = {0};

	bool prime[500000] = {0};
	bool freeNum[500000] = {0};

	int C[500000] = {0};

	prime[0] = true;
	prime[1] = true;

	for(int i=2;i*i<=500000;i++){
		if(!prime[i]){
			for(int j=i*i;j<500000;j+=i){
				prime[j] = true;
			}
		}
	}

	S[1] = 1;

	for(int i=2;i<100009;i++){
		S[i]++;
		for(int j=i;j<100009;j+=i){
			S[j] += i;
		}
	}

	freeNum[0] = true;

	for(int i=2;i*i<=100009;i++){
		for(int j=i*i;j<100009;j+=i*i){
			freeNum[j] = true;
		}
	}

	for(int i=2;i<500000;i++){
		if(!prime[i]){
			for(int j=i;j<500000;j+=i){
				C[j]++;
			}
		}
	}

	for(int i=2;i<100009;i++){
		pSum[i] = pSum[i-1];
		if(!freeNum[i] && !prime[C[S[i]]]){
			pSum[i] += S[i];
		}
	}

	int T,L,R;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d",&L,&R);

		assert(L>=1 && L<=R);
		assert(R>=L && R<=100000);

		printf("%lld\n",pSum[R]-pSum[L-1]);

		T--;
	}
	
	return 0;
}
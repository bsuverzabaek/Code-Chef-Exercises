#include <stdio.h>
#include <assert.h>

int main(void){
	int N,Q,idx;

	scanf("%d %d",&N,&Q);

	assert(N>=1 && N<=100000);
	assert(Q>=1 && Q<=100000);

	int f[100100];
	int s[100100];

	for(int i=1;i<=N;i++){
		scanf("%d",&f[i]);
		assert(f[i]>=0 && f[i]<=1000000000);
		f[N+1] ^= f[i];
	}

	for(int i=1;i<=N+1;i++){
		s[i] = s[i-1]^f[i];
	}

	while(Q>0){
		scanf("%d",&idx);
		assert(idx>=1 && idx<=1000000000);

		idx = ((idx-1)%(N+1))+1;
		printf("%d\n",s[idx]);

		Q--;
	}
	
	return 0;
}
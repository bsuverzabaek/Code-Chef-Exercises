#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,s4,s7;

	int f4[100001];
	int f7[100001];
	int ans[100001];
	int c[100001];

	f4[4] = 1;
	f7[7] = 1;

	for(int i=14;i<=100000;i++){
		f4[i] = (i%10==4)+f4[i/10];
		f7[i] = (i%10==7)+f7[i/10];
	}

	ans[1] = 1;
	c[0] = 2;

	s4 = 0;
	s7 = 0;

	for(int i=2;i<=100000;i++){
		s4 += f4[i];
		s7 += f7[i];
		ans[i] = ans[i-1]+c[s4-s7];
		c[s4-s7]++;
	}

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		printf("%d\n",ans[N]);
		
		T--;
	}
	
	return 0;
}
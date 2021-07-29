#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,c,p;
	float x;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=120);

		char B[N];
		scanf("%s",B);

		c = 0;

		for(int i=0;i<N;i++){
			assert(B[i]=='0' || B[i]=='1');

			if(B[i]=='0'){
				c++;
			}
		}

		p = 120-c;
		x = (p*100)/120;

		if(x>=75){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}
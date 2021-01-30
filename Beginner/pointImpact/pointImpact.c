#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,K,x,y;
	int X,Y;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d %d %d",&N,&K,&x,&y);

		assert(N>=2 && N<=1000000000);
		assert(K>=1 && K<=1000000000);

		if(x==y){
			X = N;
			Y = N;
		}else{
			if(x>y){
				if(K%4==1){
					X = N;
					Y = N - x + y;
				}else if(K%4==2){
					X = N - x + y;
					Y = N;
				}else if(K%4==0){
					X = x - y;
					Y = 0;
				}else{
					X = 0;
					Y = x- y;
				}
			}else{
				if(K%4==1){
					X = N + x - y;
					Y = N;
				}else if(K%4==2){
					X = N;
					Y = N + x - y;
				}else if(K%4==0){
					X = 0;
					Y = y - x;
				}else{
					X = y - x;
					Y = 0;
				}
			}
		}

		printf("%d %d\n",X,Y);

		T--;
	}
	
	return 0;
}
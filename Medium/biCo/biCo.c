#include <stdio.h>
#include <assert.h>

int main(void){
	int T,R,C,moves;
	long long int grid[100][50],coins[50],G;

	for(int i=0;i<100;i++){
		grid[i][0] = 1;

		for(int j=1;j<=i && j<50;j++){
			if(i==j){
				grid[i][j] = 1;
			}else{
				grid[i][j] = grid[i-1][j-1]+grid[i-1][j];
			}
		}
	}

	scanf("%d",&T);
	assert(T>=1 && T<=10000);

	while(T>0){
		scanf("%d %d %lld",&R,&C,&G);

		assert(C>=0 && C<=49);
		assert(R>=0 && R<=99);
		assert(G>=1 && G<=1000000000000);

		moves = 0;

		while(G>0){
			R = C;

			while(R<100 && grid[R][C]<=G){
				R++;
			}

			R--;
			G -= grid[R][C];
			coins[moves] = grid[R][C];
			moves++;
			C--;
		}

		printf("%d\n",moves);

		for(int i=0;i<moves;i++){
			printf("%lld ",coins[i]);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
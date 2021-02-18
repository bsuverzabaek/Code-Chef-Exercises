#include <stdio.h>
#include <assert.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,i,j,r;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=4 && N<=1000);

		char board[1000][1000];
		int ans[1000][1000];

		for(i=0;i<N;i++){
			scanf("%s",board[i]);
		}

		for(j=N-1;j>=0;j--){
			for(i=0;i<N;i++){
				r = 0;

				if(j+1<N && i+2<N){
					r = max(r,ans[i+2][j+1]);
				}

				if(j+1<N && i-2>=0){
					r = max(r,ans[i-2][j+1]);
				}

				if(j+2<N && i+1<N){
					r = max(r,ans[i+1][j+2]);
				}

				if(j+2<N && i-1>=0){
					r = max(r,ans[i-1][j+2]);
				}

				if(board[i][j]=='P'){
					ans[i][j] = r+1;
				}else{
					ans[i][j] = r;
				}

				if(board[i][j]=='K'){
					break;
				}
			}

			if(i<N){
				break;
			}
		}

		printf("%d\n",ans[i][j]);

		T--;
	}
	
	return 0;
}
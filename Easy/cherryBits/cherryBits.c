#include <stdio.h>
#include <assert.h>

int main(void){
	int N,M,Q;
	int x1,x2,y1,y2;

	scanf("%d %d",&N,&M);
	assert(N>=1 && N<=1000 && M>=1 && M<=1000);

	char S[N][M];
	int ans[N][M];
	int pre[N][M];

	for(int i=0;i<N;i++){
		scanf("%s",S[i]);
	}

	for(int i=0;i<N;i++){
		for(int j=0;j<M;j++){
			assert(S[i][j]=='0' || S[i][j]=='1');
			ans[i][j] = S[i][j]-'0';
			pre[i][j] = 0;
		}
	}

	scanf("%d",&Q);
	assert(Q>=1 && Q<=1000000);

	while(Q>0){
		scanf("%d %d %d %d",&x1,&y1,&x2,&y2);

		assert(x1>=1 && x1<=x2 && x2>=x1 && x2<=N);
		assert(y1>=1 && y1<=y2 && y2>=y1 && y2<=M);

		x1--;
		x2--;
		y1--;
		y2--;

		pre[x1][y1]++;

		if(x2+1<N && y2+1<M){
			pre[x2+1][y2+1]++;
		}

		if(x2+1<N){
			pre[x2+1][y1]--;
		}

		if(y2+1<M){
			pre[x1][y2+1]--;
		}

		Q--;
	}

	for(int i=0;i<M;i++){
		for(int j=1;j<N;j++){
			pre[j][i] += pre[j-1][i];
		}
	}

	for(int i=0;i<N;i++){
		for(int j=1;j<M;j++){
			pre[i][j] += pre[i][j-1];
		}
	}

	for(int i=0;i<N;i++){
		for(int j=0;j<M;j++){
			if(pre[i][j]%2!=0){
				if(ans[i][j]==1){
					printf("0");
				}else{
					printf("1");
				}
			}else{
				printf("%d",ans[i][j]);
			}
		}
		printf("\n");
	}
	
	return 0;
}
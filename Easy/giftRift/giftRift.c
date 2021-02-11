#include <stdio.h>
#include <assert.h>

int main(void){
	int R,C,ans;

	scanf("%d %d",&R,&C);

	assert(R>=1 && R<=100);
	assert(C>=1 && C<=100);

	int gift[R][C];
	int mn[R];
	int mx[C];

	for(int i=0;i<R;i++){
		for(int j=0;j<C;j++){
			scanf("%d",&gift[i][j]);
			assert(gift[i][j]>=1 && gift[i][j]<100000000);
		}
	}

	for(int i=0;i<R;i++){
		mn[i] = gift[i][0];
	}

	for(int i=0;i<C;i++){
		mx[i] = gift[0][i];
	}

	for(int i=0;i<R;i++){
		for(int j=0;j<C;j++){
			if(mn[i]>gift[i][j]){
				mn[i] = gift[i][j];
			}

			if(mx[j]<gift[i][j]){
				mx[j] = gift[i][j];
			}
		}
	}

	ans = 0;

	for(int i=0;i<R;i++){
		for(int j=0;j<C;j++){
			if(gift[i][j]==mn[i] && gift[i][j]==mx[j]){
				ans = gift[i][j];
			}
		}
	}

	if(ans!=0){
		printf("%d\n",ans);
	}else{
		printf("GUESS\n");
	}
	
	return 0;
}
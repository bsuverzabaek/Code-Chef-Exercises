#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M,res;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=50);
		assert(M>=1 && M<=50);

		int mat[N][M];
		int a[N];

		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				scanf("%d",&mat[i][j]);
				assert(mat[i][j]>=1 && mat[i][j]<=50);
			}
		}

		for(int i=0;i<N;i++){
			a[i] = mat[i][M-1];

			for(int j=M-2;j>=0;j--){
				if(mat[i][j]>a[i]){
					a[i] = mat[i][j];
				}else{
					a[i] = mat[i][j]-1;
				}
			}
		}

		res = 0;

		for(int i=0;i<N;i++){
			res ^= a[i];
		}

		if(res!=0){
			printf("FIRST\n");
		}else{
			printf("SECOND\n");
		}

		T--;
	}
	
	return 0;
}
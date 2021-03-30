#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,M,u,v,max,tri,v1,v2;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=10000);
		assert(M>=0 && M<=10000);

		int adjList[N][N-1];

		for(int i=0;i<N;i++){
			for(int j=0;j<N-1;j++){
				adjList[i][j] = 0;
			}
		}

		int edgeCnt[N];

		for(int i=0;i<N;i++){
			edgeCnt[i] = 0;
		}

		for(int i=0;i<M;i++){
			scanf("%d %d",&u,&v);

			assert(u>=1 && u<=N);
			assert(v>=1 && v<=N);
			assert(u!=v);

			adjList[u-1][edgeCnt[u-1]] = v-1;
			adjList[v-1][edgeCnt[v-1]] = u-1;

			edgeCnt[u-1]++;
			edgeCnt[v-1]++;
		}

		max = 0;

		for(int i=0;i<N;i++){
			if(edgeCnt[i]>max){
				max = edgeCnt[i];
			}
		}

		if(max==2){
			tri = 0;

			for(int i=0;i<N;i++){
				if(edgeCnt[i]==2){
					v1 = adjList[i][0];
					v2 = adjList[i][1];

					for(int j=0;j<edgeCnt[v1];j++){
						if(adjList[v1][j]==v2){
							tri = 1;
							break;
						}
					}
				}
			}

			if(tri!=0){
				max = 3;
			}
		}

		printf("%d\n",max);

		T--;
	}
	
	return 0;
}
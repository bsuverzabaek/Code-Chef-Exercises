#include <stdio.h>
#include <assert.h>

int X[10000];

int find(int x){
	int y = x;

	while(x!=X[x]){
		x = X[x];
	}

	while(y!=x){
		int t = X[y];
		X[y] = x;
		y = t;
	}

	return x;
}

int main(void){
	int T,N,Q,l,x,y,fx,fy;

	scanf("%d",&T);
	assert(T>=1 && T<=25);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=10000);

		int S[N];

		for(int i=0;i<N;i++){
			scanf("%d",&S[i]);
			assert(S[i]>=0 && S[i]<=1000000);
			X[i]=i;
		}

		scanf("%d",&Q);
		assert(Q>=1 && Q<=10000);

		while(Q>0){
			scanf("%d",&l);
			assert(l==0 || l==1);

			if(l==0){
				scanf("%d %d",&x,&y);
				assert(x>=1 && x<=N && y>=1 && y<=N);

				x--;
				y--;

				fx = find(x);
				fy = find(y);

				if(fx==fy){
					printf("Invalid query!\n");
				}else{
					if(S[fx]>S[fy]){
						X[fy] = fx;
					}else if(S[fx]<S[fy]){
						X[fx] = fy;
					}
				}
			}else{
				scanf("%d",&x);
				assert(x>=1 && x<=N);

				printf("%d\n",find(x-1)+1);
			}

			Q--;
		}

		T--;
	}
	
	return 0;
}
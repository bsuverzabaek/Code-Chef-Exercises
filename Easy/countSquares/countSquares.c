#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,count;
	int x1,x2,x3,x4,y1,y2,y3,y4;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=4 && N<=500);

		int x[500];
		int y[500];
		int p[101][101] = {0};

		for(int i=0;i<N;i++){
			scanf("%d %d",&x[i],&y[i]);
			assert(x[i]>=-50 && x[i]<=50);
			assert(y[i]>=-50 && y[i]<=50);
			x[i] += 50;
			y[i] += 50;
			p[x[i]][y[i]] = 1;
		}

		count = 0;

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i!=j){
					x1 = x[i];
					y1 = y[i];

					x2 = x[j];
					y2 = y[j];

					x3 = x1+y1-y2;
					y3 = y1+x2-x1;

					x4 = x2+y1-y2;
					y4 = y2+x2-x1;

					if(x3>=0 && x3<=100){
						if(y3>=0 && y3<=100){
							if(x4>=0 && x4<=100){
								if(y4>=0 && y4<=100){
									if(p[x3][y3]==1 && p[x4][y4]==1){
										count++;
									}
								}
							}
						}
					}
				}
			}
		}

		printf("%d\n",count/4);

		T--;
	}
	
	return 0;
}
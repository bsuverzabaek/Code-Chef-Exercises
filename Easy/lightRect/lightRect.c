#include <stdio.h>
#include <assert.h>

int main(void){
	int T,K,N;

	scanf("%d",&T);
	assert(T>=1 && T<=5000);

	while(T>0){
		scanf("%d %d",&K,&N);

		assert(K>=1 && K<=100);
		assert(N>=1 && N<=1000000000);

		int x[K];
		int y[K];

		for(int i=0;i<K;i++){
			scanf("%d %d",&x[i],&y[i]);

			assert(x[i]>=0 && x[i]<=N-1);
			assert(y[i]>=0 && y[i]<=N-1);
		}

		if(K==1){
			if((x[0]==0 || x[0]==N-1) && (y[0]==0 || y[0]==N-1)){
				printf("yes\n");
			}else{
				printf("no\n");
			}
		}else if(K==2){
			if((x[0]==0 || x[0]==N-1) && (y[0]==0 || y[0]==N-1)){
				printf("yes\n");
			}else if((x[1]==0 || x[1]==N-1) && (y[1]==0 || y[1]==N-1)){
				printf("yes\n");
			}else if((y[0]==0 || y[0]==N-1) && (y[1]==0 || y[1]==N-1)){
				printf("yes\n");
			}else{
				printf("no\n");
			}
		}else if(K==3){
			if((x[0]==0 || x[0]==N-1) && ((y[0]>=y[1] && y[0]>=y[2]) || (y[0]<=y[1] && y[0]<=y[2]))){
				printf("yes\n");
			}else if((y[0]==0 || y[0]==N-1) && ((x[0]>=x[1] && x[0]>=x[2]) || (x[0]<=x[1] && x[0]<=x[2]))){
				printf("yes\n");
			}else if((x[1]==0 || x[1]==N-1) && ((y[1]>=y[0] && y[1]>=y[2]) || (y[1]<=y[0] && y[1]<=y[2]))){
				printf("yes\n");
			}else if((y[1]==0 || y[1]==N-1) && ((x[1]>=x[0] && x[1]>=x[2]) || (x[1]<=x[0] && x[1]<=x[2]))){
				printf("yes\n");
			}else if((x[2]==0 || x[2]==N-1) && ((y[2]>=y[0] && y[2]>=y[1]) || (y[2]<=y[0] && y[2]<=y[1]))){
				printf("yes\n");
			}else if((y[2]==0 || y[2]==N-1) && ((x[2]>=x[0] && x[2]>=x[1]) || (x[2]<=x[0] && x[2]<=x[1]))){
				printf("yes\n");
			}else if((x[2]==0 || x[2]==N-1) && ((y[1]==0 || y[1]==N-1) || (y[0]==0 || y[0]==N-1))){
				printf("yes\n");
			}else if((x[1]==0 || x[1]==N-1) && ((y[2]==0 || y[2]==N-1) || (y[0]==0 || y[0]==N-1))){
				printf("yes\n");
			}else if((x[0]==0 || x[0]==N-1) && ((y[1]==0 || y[1]==N-1) || (y[2]==0 || y[2]==N-1))){
				printf("yes\n");
			}else{
				printf("no\n");
			}
		}else if(K>=4){
			printf("yes\n");
		}

		T--;
	}
	
	return 0;
}
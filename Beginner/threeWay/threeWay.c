#include <stdio.h>

int dist(int x1,int y1,int x2,int y2){
	return ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2));
}

int main(void){
	int T,R,pair;
	int x[3],y[3];

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100){
			printf("T must be 1 <= T <= 100\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&R);

			if(R<=0 || R>1000){
				printf("R must be 1 <= R <= 1000\n");
			}else{
				break;
			}
		}

		while(1){
			scanf("%d %d",&x[0],&y[0]);

			if(x[0]<-10000 || x[0]>10000 || y[0]<-10000 || y[0]>10000){
				printf("x1 and y1 must be -10000 <= x1,y1 <= 10000\n");
			}else{
				break;
			}
		}

		while(1){
			scanf("%d %d",&x[1],&y[1]);

			if(x[1]<-10000 || x[1]>10000 || y[1]<-10000 || y[1]>10000){
				printf("x2 and y2 must be -10000 <= x2,y2 <= 10000\n");
			}else{
				break;
			}
		}

		while(1){
			scanf("%d %d",&x[2],&y[2]);

			if(x[2]<-10000 || x[2]>10000 || y[2]<-10000 || y[2]>10000){
				printf("x3 and y3 must be -10000 <= x3,y3 <= 10000\n");
			}else{
				break;
			}
		}

		pair = 0;

		for(int i=0;i<2;i++){
			if(dist(x[i],y[i],x[i+1],y[i+1])<=R*R){
				pair++;
			}
		}

		if(pair>1){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}

	return 0;
}
#include <stdio.h>

int min(int best,int num){
	if(best<num){
		return best;
	}else{
		return num;
	}
}

int max(int best,int num){
	if(best>num){
		return best;
	}else{
		return num;
	}
}

int main(void){
	int T,N;
	int l,best,worst,num;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>2000){
			printf("T must be 1 <= T <= 2000\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=1 || N>8){
				printf("N must be 2 <= N <= 8\n");
			}else{
				break;
			}
		}

		int X[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&X[i]);

				if(X[i]<0 || X[i]>10){
					printf("X[%d] must be 0 <= X[i] <= 10\n",i);
				}else{
					break;
				}
			}
		}

		for(int i=0;i<N-1;i++){
			if(X[i]>=X[i+1]){
				printf("Each X[i] must be less than X[i+1]\n");
				return 0;
			}
		}

		l = 0;
		best = N;
		worst = 0;

		for(int i=0;i<N;i++){
			if(i && X[i]-X[i-1]>2){
				l = i;
			}
			if(i+1==N || X[i+1]-X[i]>2){
				num = i - l + 1;
				best = min(best,num);
				worst = max(worst,num);
			}
		}

		printf("%d %d\n",best,worst);

		T--;
	}

	return 0;
}
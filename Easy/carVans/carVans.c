#include <stdio.h>

int main(void){
	int T,N;
	int x,front,ans;

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
			scanf("%d",&N);

			if(N<=0 || N>10000){
				printf("N must be 1 <= N <= 10000\n");
			}else{
				break;
			}
		}

		scanf("%d",&x);
		front = x;
		ans = 1;

		for(int i=0;i<N-1;i++){
			scanf("%d",&x);
			if(x<front){
				front = x;
				ans++;
			}
		}

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
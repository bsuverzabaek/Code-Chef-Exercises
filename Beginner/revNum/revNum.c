#include <stdio.h>

int main(void){
	int T,N,rem,ans;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>1000000){
				printf("N must be 1 <= N <= 1000000\n");
			}else{
				break;
			}
		}

		ans = 0;

		while(N>0){
			rem = N%10;
			ans = rem+ans*10;
			N /= 10;
		}

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
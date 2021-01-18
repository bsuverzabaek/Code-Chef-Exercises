#include <stdio.h>

int revFunc(int N){
	int ans = 0;

	while(N>0){
		int rem = N%10;
		ans = rem+ans*10;
		N /= 10;
	}

	return ans;
}

int main(void){
	int T,N;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>20){
			printf("T must be 1 <= T <= 20\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>20000){
				printf("N must be 1 <= N <= 20000\n");
			}else{
				break;
			}
		}

		if(N==revFunc(N)){
			printf("wins\n");
		}else{
			printf("loses\n");
		}

		T--;
	}
	
	return 0;
}
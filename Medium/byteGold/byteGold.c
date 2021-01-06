#include <stdio.h>

int sumFunc(int n){
	int sum = 0;
	sum += n/2 + n/3 + n/4;
	return sum;
}

int main(void){
	int T;
	int n;
	int sum;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>10){
			printf("T must be 1 <= T <= 10\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&n);

			if(n<0 || n>1000000000){
				printf("n must be 0 <= n <= 10^9\n");
			}else{
				break;
			}
		}

		sum = sumFunc(n);

		if(sum>n){
			printf("%d\n",sum);
		}else{
			printf("%d\n",n);
		}

		T--;
	}

	return 0;
}
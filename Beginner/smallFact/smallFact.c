#include <stdio.h>

int main(void){
	int T,n,ans;

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
			scanf("%d",&n);

			if(n<=0 || n>100){
				printf("n must be 1 <= n <= 100\n");
			}else{
				break;
			}
		}

		ans = n;

		for(int i=1;i<n;i++){
			ans *= i;
		}

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
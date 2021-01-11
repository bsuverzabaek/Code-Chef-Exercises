#include <stdio.h>

int main(void){
	int T;
	long long int n,k,N,R,ans;

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
			scanf("%lld %lld",&n,&k);

			if(k<=0 || k>n){
				printf("k must be 1 <= k <= n\n");
			}else if(n<k || n>1000000){
				printf("n must be k <= n <= 1000000\n");
			}else{
				break;
			}
		}

		R = n - k;
		N = k + R - 1;
		ans = 1;

		if(R>N/2){
			R = N - R;
		}

		for(long long int i=0;i<R;i++){
			ans *= N--;
			ans /= i + 1;
		}

		printf("%lld\n",ans);

		T--;
	}
	
	return 0;
}
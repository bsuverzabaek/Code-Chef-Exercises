#include <stdio.h>

int main(void){
	int T,N,sum;
	long long int ans,count;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>100000){
			printf("T must be 1 <= T <= 10^5\n");
		}else{
			break;
		}
	}

	sum = 0;

	while(T>0){

		while(1){
			scanf("%d",&N);

			if(N<=0 || N>100000){
				printf("N must be 1 <= N <= 10^5\n");
			}else{
				break;
			}
		}

		sum += N;

		if(T==1 && sum>100000){
			printf("The sum of N over all test cases must be <= 10^5\n");
			return 0;
		}

		char s[N];
		scanf("%s",s);
		ans = 0;
		count = 0;

		for(int i=0;i<N;i++){
			if(s[i]=='1'){
				count++;
			}
		}

		ans = (count*(count+1))/2;
		printf("%lld\n",ans);

		T--;
	}

	return 0;
}
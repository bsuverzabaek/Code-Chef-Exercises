#include <stdio.h>
#include <math.h>

int main(void){
	int T,p,ans;
	int P[12];

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>5){
			printf("T must be 1 <= T <= 5\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d",&p);

			if(p<0 || p>100000){
				printf("p must be 1 <= p <= 10^5\n");
			}else{
				break;
			}
		}

		for(int i=0;i<12;i++){
			P[i] = pow(2,i);
		}

		ans = 0;

		for(int i=11;i>=0;i--){
			ans += p/P[i];
			p %= P[i];
		}

		printf("%d\n",ans);

		T--;
	}

	return 0;
}
#include <stdio.h>

int main(void){
	int T;

	while(1){
		printf("Input T: ");
		scanf("%d",&T);

		if(T<=0 || T>5){
			printf("T must be 1 <= T <= 5\n");
		}else{
			break;
		}
	}

	while(T>0){
		int n;

		while(1){
			printf("Input n: ");
			scanf("%d",&n);

			if(n<=0 || n>100){
				printf("n must be 1 <= n <= 100\n");
			}else{
				break;
			}
		}

		int L[n];
		int R[n];

		for(int i=0;i<n;i++){
			while(1){
				scanf("%d",&L[i]);
				if(L[i]<=0 || L[i]>100){
					printf("L[%d] must be 1 <= L[i] <= 100\n",i);
				}else{
					break;
				}
			}
		}

		for(int i=0;i<n;i++){
			while(1){
				scanf("%d",&R[i]);
				if(R[i]<=0 || R[i]>100){
					printf("R[%d] must be 1 <= R[i] <= 100\n",i);
				}else{
					break;
				}
			}
		}

		int max = 0;
		int maxR = 0;
		int num = 0;

		for(int i=0;i<n;i++){
			if(L[i]*R[i]>max){
				max = L[i]*R[i];
				maxR = R[i];
				num = i;
			}else if(L[i]*R[i]==max && R[i]>maxR){
				maxR = R[i];
				num = i;	
			}
		}

		printf("%d\n",num+1);

		T--;
	}

	return 0;
}
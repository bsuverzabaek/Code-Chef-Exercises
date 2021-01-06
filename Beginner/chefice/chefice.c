#include <stdio.h>

int main(void){
	int T;
	printf("Input T: ");
	scanf("%d",&T);

	while(T>0){
		int N;
		printf("Input N: ");
		scanf("%d",&N);

		int arr[N];

		for(int i=0;i<N;i++){
			scanf("%d",&arr[i]);
		}

		int amount = 0;

		if(arr[0]==10 || arr[0]==15){
			printf("No\n");
		}else{
			amount += arr[0];
			for(int i=1;i<N;i++){
				arr[i] -= 5;
				amount -= arr[i];
			}
			if(amount < 0){
				printf("No\n");
			}else{
				printf("Yes\n");
			}
		}

		T--;
	}
	return 0;
}
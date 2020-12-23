#include <stdio.h>

int sum(int *arr, int N){
	int sum=0;

	for(int i=0;i<N;i++){
		sum += arr[i];
	}

	return sum;
}

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

		int s;
		s = sum(arr,N);

		int count = 0;

		for(int i=0;i<N;i++){
			if(s*(N-1) == N*(s-arr[i])){
				if(count==0){
					printf("%d\n",i+1);
					count++;
				}
			}
		}

		if(count==0){
			printf("Impossible\n");
		}


		T--;
	}
	
	return 0;
}
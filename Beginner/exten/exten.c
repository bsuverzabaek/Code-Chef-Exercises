#include <stdio.h>

void print_func(int *arr, int n){
	for(int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
}

int main(void){
	int T;
	printf("Input T: ");
	scanf("%d",&T);

	while(T>0){
		int n;
		printf("Input n: ");
		scanf("%d",&n);

		int A[n];
		int B[n];
		int C[n];

		for(int i=0;i<n;i++){
			scanf("%d",&C[i]);
		}

		for(int i=0;i<n;i++){
			A[i] = C[i] & 0xffff;
			//counter x = x | n
		}
		for(int i=0;i<n;i++){
			B[i] = C[i] >> 16;
			//counter n = n<<(1<<(1<<(1<<1)))
		}

		printf("\n");
		printf("Case %d:\n",T);
		print_func(A,n);
		print_func(B,n);

		T--;
	}

	return 0;
}
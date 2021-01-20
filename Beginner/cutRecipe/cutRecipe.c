#include <stdio.h>

int gcd(int A,int B){
	if(A==0){
		return B;
	}else if(B==0){
		return A;
	}else{
		int rem = A%B;
		A = B;
		B = rem;
		return gcd(A,B);
	}
}

int main(void){
	int T,N,min;

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
			scanf("%d",&N);

			if(N<=1 || N>50){
				printf("N must be 2 <= N <= 50\n");
			}else{
				break;
			}
		}

		int q[N];

		for(int i=0;i<N;i++){
			while(1){
				scanf("%d",&q[i]);

				if(q[i]<=0 || q[i]>1000){
					printf("q[%d] must be 1 <= q[i] <= 1000\n",i);
				}else{
					break;
				}
			}
		}

		min = q[0];

		for(int i=0;i<N;i++){
			min = gcd(min,q[i]);
		}

		for(int i=0;i<N;i++){
			printf("%d ",q[i]/min);
		}
		printf("\n");

		T--;
	}

	return 0;
}
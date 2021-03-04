#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int main(void){
	int T,N,Z1,Z2,flag,x;

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%d %d %d",&N,&Z1,&Z2);

		assert(N>=1 && N<=50);
		assert(abs(Z1)<=1000000000);
		assert(abs(Z2)<=1000000000);

		int A[N];
		flag = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(abs(A[i])<=1000000000);

			if((-A[i]==Z1) || (-A[i]==Z2) || (A[i]==Z1) || (A[i]==Z2)){
				flag = 1;
			}
		}

		if(flag==1){
			printf("1\n");
		}else{
			for(int i=0;i<N;i++){
				x = -A[i];
				flag = 0;

				for(int j=0;j<N;j++){
					if((x+A[j]==Z1) || (x-A[j]==Z1) || (x+A[j]==Z2) || (x-A[j]==Z2)){
						flag = 1;
					}
				}

				if(flag==0){
					break;
				}

				x = A[i];
				flag = 0;

				for(int j=0;j<N;j++){
					if((x+A[j]==Z1) || (x-A[j]==Z1) || (x+A[j]==Z2) || (x-A[j]==Z2)){
						flag = 1;
					}
				}

				if(flag==0){
					break;
				}
			}

			if(flag==0){
				printf("0\n");
			}else{
				printf("2\n");
			}
		}

		T--;
	}
	
	return 0;
}
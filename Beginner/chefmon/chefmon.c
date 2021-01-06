#include <stdio.h>

int main(){
	int T;
	printf("Input T: ");
	scanf("%d",&T);

	int total;

	while(T > 0){
		total = 0;
		int A[2];
		for(int i=0;i<2;i++){
			scanf("%d",&A[i]);
		}

		if(A[0]%A[1]==0){
			total += A[0]/A[1];
		}else if(A[0]%2!=0){
			A[0] -= 1;
			total++;
			if(A[0]!=0){
				for(int i=A[1];i>=2;i-=2){
					int j = 1;
					while(i*j<=A[0]){
						j++;
					}
					j--;
					total += j;
					A[0] -= i*j;
				}
			}
		}else{
			for(int i=A[1];i>=2;i-=2){
				int j = 1;
				while(i*j<=A[0]){
					j++;
				}
				j--;
				total += j;
				A[0] -= i*j;
			}
		}

		printf("%d\n",total);

		T--;
	}
	
	return 0;
}
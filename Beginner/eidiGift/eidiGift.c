#include <stdio.h>
#include <assert.h>

int main(void){
	int T,A[3],C[3],flag;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		for(int i=0;i<3;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=1 && A[i]<=17);
		}

		for(int i=0;i<3;i++){
			scanf("%d",&C[i]);
			assert(C[i]>=1 && C[i]<=100);
		}

		flag = 1;

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i!=j){
					if(A[i]<A[j]){
						if(C[i]>=C[j]){
							flag = 0;
							break;
						}
					}else if(A[i]==A[j]){
						if(C[i]!=C[j]){
							flag = 0;
							break;
						}
					}else{
						if(C[i]<=C[j]){
							flag = 0;
							break;
						}
					}
				}
			}
		}

		if(flag==1){
			printf("FAIR\n");
		}else{
			printf("NOT FAIR\n");
		}

		T--;
	}
	
	return 0;
}
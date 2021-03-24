#include <stdio.h>
#include <assert.h>

int main(void){
	int M,N,temp,ans,x;

	scanf("%d %d",&M,&N);

	assert(M>=1 && M<=200000);
	assert(N>=1 && N<=200000);

	int A[M];

	for(int i=0;i<M;i++){
		scanf("%d",&A[i]);
		assert(A[i]>=1 && A[i]<=200000);
	}

	ans = 0;
	x = 0;

	for(int i=0;i<M;i++){
		for(int j=0;j<M-i-1;j++){
			if(A[j]>A[j+1]){
				temp = A[j];
				A[j] = A[j+1];
				A[j+1] = temp;
			}

			if(j==M-i-2){
				if(A[j+1]<=N && N!=0){
					ans += ((A[j+1]*(A[j+1]+1))/2)+1;
					N -= A[j+1];
				}else if(A[j+1]>N && N!=0){
					ans += ((N*(N+1))/2)+1;
					N = 0;
				}

				if(j==0 && A[j]<=N && N!=0){
					ans += ((A[j]*(A[j]+1))/2)+1;
					N -= A[j];
				}else if(j==0 && A[j]>N && N!=0){
					ans += ((N*(N+1))/2)+1;
					N = 0;
				}

				if(N==0){
					x = j+1;
					break;
				}
			}
		}

		if(N==0){
			break;
		}
	}

	printf("%d\n",ans+x);
	
	return 0;
}
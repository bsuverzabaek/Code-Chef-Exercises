#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,N,count,sumN;

	scanf("%d",&T);
	assert(T>=1 && T<=2000);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=2000);

		sumN += pow(N,2);

		if(T==1){
			assert(sumN<=4000000);
		}

		if(N==1){
			printf("Hooray\n");
			printf("1\n");
		}else if(N%2!=0){
			printf("Boo\n");
		}else{
			int A[N+1][N+1];

			for(int i=1;i<=N;i++){
				A[i][i] = 2*N-1;
			}

			count = -1;

			for(int i=1;i<=N-1;i++){
				if(i==N-2){
                    if(i==1){
                    	A[i][N]=1;
                    }else{
                    	A[i][N]=(A[i-1][N]+2)%(N-1);
                    	break;
                    }
                }

                if(count==-1){
                    count=1;
                    A[i][N]=N-1;
                }else{
                    count=A[i-1][i+1]+1;
                    A[i][N]=(count-1)%(N-1);
                }

                for(int j=i+1;j<=N-1;j++){
                    if(count==N){
                   		count=1;
                    	A[i][j]=count;
                    	count++;
                    }
                }
			}

			for(int i=2;i<=N;i++){
                for(int j=1;j<i;j++){
                    A[i][j]=2*N-1-A[j][i];
                }
            }

            printf("Hooray\n");

            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                	printf("%d ",A[i][j]);
           	 	}
                printf("\n");
            }
		}

		T--;
	}
	
	return 0;
}
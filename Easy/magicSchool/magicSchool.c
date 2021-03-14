#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,a,b,c,d,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=50);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=0 && A[i]<=100000);
		}

		if(N==1){
			printf("-1\n");
		}else{
			a = -1;
			b = -1;
			c = 0;
			d = 0;
			flag = 0;

			for(int i=0;i<N;i++){
				if(a==-1){
					a = A[i];
				}else{
					if(A[i]!=a && A[i]!=b){
						if(b==-1){
							b = A[i];
						}else{
							flag = -1;
						}
					}
				}

				if(A[i]==a){
					c++;
				}

				if(A[i]==b){
					d++;
				}
			}

			if(flag==-1){
				printf("-1\n");
				continue;
			}else{
				if(b==-1){
					if(a==0){
						printf("%d\n",N);
					}else if(a==N-1){
						printf("0\n");
					}else{
						printf("-1\n");
					}
				}else{
					if(a>b){
						if(abs(a-b)==1 && max(a,b)<=N-1 && d==a && c+d==N){
							printf("%d\n",N-max(a,b));
						}else{
							printf("-1\n");
						}
					}else{
						if(abs(a-b)==1 && max(a,b)<=N-1 && c==b && c+d==N){
							printf("%d\n",N-max(a,b));
						}else{
							printf("-1\n");
						}
					}
				}
			}
		}

		T--;
	}
	
	return 0;
}
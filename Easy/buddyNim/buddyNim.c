#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,M,x,a,b,flag;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&M);

		assert(N>=1 && N<=100);
		assert(M>=1 && M<=100);

		int A[N];
		int B[M];

		a = 0;
		b = 0;
		flag = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&x);
			assert(x>=0 && x<=1000000000);

			if(x>0){
				A[a++] = x;
			}
		}

		for(int i=0;i<M;i++){
			scanf("%d",&x);
			assert(x>=0 && x<=1000000000);

			if(x>0){
				B[b++] = x;
			}
		}

		qsort(A,a,sizeof(int),compare);
		qsort(B,b,sizeof(int),compare);

		if(a==b){
			for(int i=0;i<a;i++){
				if(A[i]!=B[i]){
					flag = 1;
					break;
				}
			}
		}

		if(a==b && flag==0){
			printf("Bob\n");
		}else{
			printf("Alice\n");
		}

		T--;
	}
	
	return 0;
}
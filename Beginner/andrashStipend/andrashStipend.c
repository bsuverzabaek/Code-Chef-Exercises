#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,count,fail,total;
	double avg;

	scanf("%d",&T);
	assert(T>=1 && T<=40);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		int A[N];

		count = 0;
		fail = 0;
		total = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&A[i]);
			assert(A[i]>=2 && A[i]<=5);

			total += A[i];

			if(A[i]==5){
				count = 1;
			}else if(A[i]==2){
				fail = 1;
			}
		}

		avg = (double)total/(double)N;

		if(avg>=4.0 && count==1 && fail==0){
			printf("Yes\n");
		}else{
			printf("No\n");
		}

		T--;
	}
	
	return 0;
}
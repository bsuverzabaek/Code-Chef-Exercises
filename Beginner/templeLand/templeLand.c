#include <stdio.h>
#include <assert.h>

int main(void){
	int S,N,flag,count;

	scanf("%d",&S);
	assert(S>=1 && S<=100);

	while(S>0){
		scanf("%d",&N);
		assert(N>=3 && N<=100);

		int H[N];

		if(N%2==0){
			for(int i=0;i<N;i++){
				scanf("%d",&H[i]);
				assert(H[i]>=1 && H[i]<=100);
			}

			printf("no\n");
		}else{
			for(int i=0;i<N;i++){
				scanf("%d",&H[i]);
				assert(H[i]>=1 && H[i]<=100);
			}

			for(int i=0;i<N/2;i++){
				if(H[i+1]-H[i]==1){
					flag = 1;
				}else{
					flag = 0;
					break;
				}
			}

			count = 0;

			for(int i=0;i<N/2;i++){
				if(H[i]==H[N-i-1]){
					count++;
				}
			}

			if(flag==1 && count==N/2 && H[0]==1){
				printf("yes\n");
			}else{
				printf("no\n");
			}
		}

		S--;
	}
	
	return 0;
}
#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,max,init,fin,K;

	scanf("%d",&T);
	assert(T>=1 && T<=5);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000 && N%2==0);

		int W[N];
		max = 0;

		for(int i=0;i<N;i++){
			scanf("%d",&W[i]);
			assert(W[i]>=1 && W[i]<=100000);

			if(W[i]>max){
				max = W[i];
			}
		}

		int i;

		for(i=0;i<N;i++){
			if(W[i]==max){
				init = i;
				fin = i;
				i++;
				break;
			}
		}

		while(i<N){
			if(W[i]==max){
				fin = i;
			}
			i++;
		}

		if(init==N/2){
			K=(N-fin);
		}else if(init>N/2){
			K=(init-N/2)+(N-fin);
		}else if(init<N/2){
			if(fin+(N/2-init)>=N){
				K=0;
			}else{
				K=N-(fin+(N/2-init));
			}
		}

		printf("%d\n",K);

		T--;
	}
	
	return 0;
}
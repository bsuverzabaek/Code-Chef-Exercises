#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,N,sumN,sum,index,x;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000000);

		sumN += N;

		if(T==1){
			assert(sumN<=1000000);
		}

		int a[N];

		for(int i=0;i<N;i++){
			a[i] = 1;
		}

		sum = N;
		index = N-1;

		while(1){
			x = (int)sqrt(sum);

			if(x*x==sum){
				break;
			}

			while(a[index]==9){
				index--;
			}

			sum -= a[index]*a[index];
			a[index]++;
			sum += a[index]*a[index];

			for(int i=index+1;i<N;i++){
				sum -= a[i]*a[i];
				a[i] = a[index];
				sum += a[i]*a[i];
			}

			while(index+1!=N){
				index++;
				sum -= a[index]*a[index];
				a[index] = a[index-1];
				sum += a[index]*a[index];
			}
		}

		for(int i=0;i<N;i++){
			printf("%d",a[i]);
		}

		printf("\n");

		T--;
	}
	
	return 0;
}
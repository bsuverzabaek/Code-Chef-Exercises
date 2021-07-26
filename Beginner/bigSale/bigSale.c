#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,p,q,d;
	double price,dPrice,sum;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		sum = 0.0;

		while(N>0){
			scanf("%d %d %d",&p,&q,&d);

			assert(p>=1 && p<=100);
			assert(q>=1 && q<=100);
			assert(d>=0 && d<=100);

			price = p+(double)(p*d)/100;
			dPrice = price-(double)(price*d)/100;
			sum += (double)q*(p-dPrice);

			N--;
		}

		printf("%.6f\n",sum);

		T--;
	}
	
	return 0;
}
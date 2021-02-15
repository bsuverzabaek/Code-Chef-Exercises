#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T;
	long long int xf,count,X,Y,P;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld",&xf);
		assert(xf>=1 && xf<=1000000000);

		count = 0;
		X = 1;
		Y = 1;
		P = 1;

		while(1){
			if(X==xf){
				printf("%lld\n",count+1);
				break;
			}

			if(X>xf){
				printf("%lld\n",count);
				break;
			}

			count++;
			P = sqrt(Y)+1;
			X = P;
			Y += P*P;
		}

		T--;
	}
	
	return 0;
}
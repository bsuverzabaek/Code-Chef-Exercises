#include <stdio.h>
#include <assert.h>
#include <math.h>

int findPoint(double R,double K){
	double inner = (int)sqrt(2*R-1);

	if(R-sqrt((R-1)*(R-1)+inner*inner)<=K/100){
		printf("%.0lf %.0lf\n",(R-1),inner);
		return 0;
	}

	printf("-1\n");
	return 0;
}

int main(void){
	int T,out;
	double R,K;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%lf %lf",&R,&K);

		assert(R>=2 && R<=1000000000);
		assert(K>=1 && K<=99);

		out = findPoint(R,K);

		T--;
	}
	
	return 0;
}
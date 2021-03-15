#include <stdio.h>
#include <assert.h>
#include <math.h>

double value(double x,double b,double c){
	return (x*x+b*x+c)/sin(x);
}

int main(void){
	int T;
	double b,c,L,R,x1,x2,f1,f2;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lf %lf",&b,&c);

		assert(b>=1 && b<=20);
		assert(c>=1 && c<=20);

		L = 0;
		R = M_PI/2.0;

		while(R-L>=1e-6){
			x1 = L+(R-L)/3.0;
			x2 = R-(R-L)/3.0;

			f1 = value(x1,b,c);
			f2 = value(x2,b,c);

			if(f1>f2){
				L = x1;
			}else{
				R = x2;
			}
		}

		printf("%.10lf\n",value(L,b,c));

		T--;
	}
	
	return 0;
}
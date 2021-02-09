#include <stdio.h>
#include <assert.h>

double max(double a,double b,double c,double d){
	if(a>b && a>c && a>d){
		return a;
	}else if(b>a && b>c && b>d){
		return b;
	}else if(c>a && c>b && c>d){
		return c;
	}else{
		return d;
	}
}

int main(void){
	int T;
	double DS,DT,D;

	scanf("%d",&T);
	assert(T>=1 && T<=2013);

	while(T>0){
		scanf("%lf %lf %lf",&DS,&DT,&D);

		assert(DS>=1 && DS<=2013);
		assert(DT>=1 && DT<=2013);
		assert(D>=1 && D<=2013);

		printf("%lf\n",max(0,D-DS-DT,DS-DT-D,DT-DS-D));

		T--;
	}
	
	return 0;
}
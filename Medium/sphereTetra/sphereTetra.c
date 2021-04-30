#include <stdio.h>
#include <assert.h>
#include <math.h>

double area(double a,double b,double c){
	double s = (a+b+c)/2;
	return sqrt(s*(s-a)*(s-b)*(s-c));
}

int main(void){
	int T;
	double wx,wy,wz,xy,xz,yz,sA,wx1,wy1,wz1,xy1,xz1,yz1,tmp1,tmp2,tmp3,vol;

	scanf("%d",&T);
	assert(T>=1 && T<=30);

	while(T>0){
		scanf("%lf %lf %lf %lf %lf %lf",&wx,&wy,&wz,&xy,&xz,&yz);

		assert(wx<=1000);
		assert(wy<=1000);
		assert(wz<=1000);
		assert(xy<=1000);
		assert(xz<=1000);
		assert(yz<=1000);

		sA = 0;
		sA += area(wx,wy,xy);
		sA += area(wy,wz,yz);
		sA += area(xy,xz,yz);
		sA += area(wx,wz,xz);

		wx1 = wx*wx;
		wy1 = wy*wy;
		wz1 = wz*wz;
		xy1 = xy*xy;
		xz1 = xz*xz;
		yz1 = yz*yz;

		tmp1 = wz1+xz1-wx1;
		tmp2 = wz1+yz1-wy1;
		tmp3 = yz1+xz1-xy1;

		vol = sqrt(4*(yz1*wz1*xz1)-(yz1*tmp1*tmp1)-(xz1*tmp2*tmp2)-(wz1*tmp3*tmp3)+(tmp1*tmp2*tmp3))/12;
		printf("%.4lf\n",((3*vol)/sA));

		T--;
	}
	
	return 0;
}
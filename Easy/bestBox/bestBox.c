#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,P,S;
	float h,v;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%d %d",&P,&S);

		assert(P>=1 && P<=40000);
		assert(S>=1 && S<=20000);

		h = (P-sqrt(P*P-24*S))/12;
		v = (S/2-h*(P/4-h))*h;

		printf("%.2f\n",v);

		T--;
	}
	
	return 0;
}
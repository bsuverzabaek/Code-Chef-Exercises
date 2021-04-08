#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int R,B,P,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=10);

	while(T>0){
		scanf("%lld %lld %lld",&R,&B,&P);

		assert(R>=1 && R<=100000);
		assert(B>=1 && B<=100000);
		assert(P>=0 && P<=R+B);

		ans = R+B-P;
		printf("%.12lf\n",(double) (R*P+B*ans)/(R+B));

		T--;
	}
	
	return 0;
}
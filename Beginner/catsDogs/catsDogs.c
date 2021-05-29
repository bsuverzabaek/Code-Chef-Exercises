#include <stdio.h>
#include <assert.h>

int main(void){
	int T;
	long long int C,D,L,min;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld %lld %lld",&C,&D,&L);

		assert(C>=0 && C<=1000000000);
		assert(D>=0 && D<=1000000000);
		assert(L>=0 && L<=1000000000);

		if(2*D>=C){
			min = 4*D;
		}else if(2*D<C){
			min = 4*(C-D);
		}

		if(L<min){
			printf("no\n");
		}else if(L%4!=0){
			printf("no\n");
		}else if(L>=min && L<=4*(D+C) && L%4==0){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}
	
	return 0;
}
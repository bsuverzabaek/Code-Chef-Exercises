#include <stdio.h>
#include <assert.h>

int main(void){
	int T,aMin,bMin,cMin,tMin,A,B,C;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d %d %d %d %d %d",&aMin,&bMin,&cMin,&tMin,&A,&B,&C);

		assert(aMin>=1 && aMin<=100);
		assert(bMin>=1 && bMin<=100);
		assert(cMin>=1 && cMin<=100);
		assert(A>=1 && A<=100);
		assert(B>=1 && B<=100);
		assert(C>=1 && C<=100);
		//assert(tMin>=aMin+bMin+cMin && tMin<=300);

		if(A>=aMin && B>=bMin && C>=cMin && (A+B+C)>=tMin){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}
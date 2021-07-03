#include <stdio.h>
#include <assert.h>

int main(void){
	int T,X1,X2,X3,V1,V2;
	float s1,s2,t1,t2;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d %d %d %d",&X1,&X2,&X3,&V1,&V2);

		assert(X1<=100000);
		assert(X2<=100000);
		assert(X3<=100000);

		assert(X1<X3 && X3<X2);

		assert(V1>=1 && V1<=100000);
		assert(V2>=1 && V2<=100000);

		s1 = X3-X1;
		s2 = X2-X3;

		t1 = s1/V1;
		t2 = s2/V2;

		if(t1<t2){
			printf("Chef\n");
		}else if(t1>t2){
			printf("Kefa\n");
		}else{
			printf("Draw\n");
		}

		T--;
	}
	
	return 0;
}
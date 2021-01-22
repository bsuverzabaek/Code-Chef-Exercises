#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,N;
	double V1,V2;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %lf %lf",&N,&V1,&V2);
		assert(N>=1 && N<=100);
		assert(V1>=1 && V1<=100);
		assert(V2>=1 && V2<=100);

		if(V2<sqrt(2)*V1){
			printf("Stairs\n");
		}else{
			printf("Elevator\n");
		}

		T--;
	}


	return 0;
}
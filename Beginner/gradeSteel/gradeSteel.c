#include <stdio.h>
#include <assert.h>

int main(void){
	int T,hard,tensile;
	float carbon;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %f %d",&hard,&carbon,&tensile);

		assert(hard>=0 && hard<=10000);
		assert(carbon>=0 && carbon<=10000);
		assert(tensile>=0 && tensile<=10000);

		if(hard>50 && carbon<0.7 && tensile>5600){
			printf("10\n");
		}else if(hard>50 && carbon<0.7){
			printf("9\n");
		}else if(carbon<0.7 && tensile>5600){
			printf("8\n");
		}else if(hard>50 && tensile>5600){
			printf("7\n");
		}else if(hard>50 || carbon<0.7 || tensile>5600){
			printf("6\n");
		}else{
			printf("5\n");
		}

		T--;
	}
	
	return 0;
}
#include <stdio.h>

int main(void){
	int x;
	double y;

	while(1){
		printf("Input X: ");
		scanf("%d",&x);

		if(x<=0 || x>2000){
			printf("X must be 0 < X <= 2000\n");
		}else{
			break;
		}
	}

	while(1){
		printf("Input Y: ");
		scanf("%lf",&y);

		if(y<0 || y>2000){
			printf("Y must be 0 <= Y <= 2000\n");
		}else{
			break;
		}
	}

	if(x%5 != 0 || y-x-0.50 < 0){
		printf("%.2f\n",y);
	}else{
		printf("%.2f\n",y-x-0.50);
	}
	
	return 0;
}
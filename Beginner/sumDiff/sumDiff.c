#include <stdio.h>

int main(void){
	int N1,N2;

	while(1){
		scanf("%d",&N1);
		scanf("%d",&N2);

		if(N1<-1000 || N1>1000){
			printf("N1 must be -1000 <= N1 <= 1000\n");
		}else if(N2<-1000 || N2>1000){
			printf("N2 must be -1000 <= N2 <= 1000\n");
		}else{
			break;
		}
	}

	if(N1>N2){
		printf("%d\n",N1-N2);
	}else{
		printf("%d\n",N1+N2);
	}

	return 0;
}
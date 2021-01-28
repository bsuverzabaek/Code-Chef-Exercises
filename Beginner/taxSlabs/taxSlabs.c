#include <stdio.h>
#include <assert.h>

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,tax;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d",&N);
		assert(N>=0 && N<=10000000 && N%100==0);

		tax = 0;

		if(N>=250001){
			tax += ((min(500000,N)-250000)*5)/100;
		}

		if(N>=500001){
			tax += ((min(750000,N)-500000)*10)/100;
		}

		if(N>=750001){
			tax += ((min(1000000,N)-750000)*15)/100;
		}

		if(N>=1000001){
			tax += ((min(1250000,N)-1000000)*20)/100;
		}

		if(N>=1250001){
			tax += ((min(1500000,N)-1250000)*25)/100;
		}
		
		if(N>1500000){
			tax += ((N-1500000)*30)/100;
		}

		printf("%d\n",N-tax);

		T--;
	}

	return 0;
}
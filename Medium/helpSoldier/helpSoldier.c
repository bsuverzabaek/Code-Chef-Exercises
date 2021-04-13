#include <stdio.h>
#include <assert.h>

int main(void){
	int N,T,type,value,quality,min;

	scanf("%d %d",&N,&T);

	assert(N>6 && N<101);
	assert(T>0 && T<1001);

	int cost[7] = {0};
	int qual[7] = {0};

	for(int i=0;i<N;i++){
		scanf("%d %d %d",&type,&value,&quality);

		assert(type>=1 && type<=6);
		assert(value>0);

		if(qual[type]<quality && T+cost[type]>value){
			qual[type] = quality;
			cost[type] = value;
			T = T+cost[type]-value;
		}
	}

	min = 99999;

	if(qual[1]==0){
		printf("0\n");
	}else{
		min = qual[1];

		for(int i=2;i<7;i++){
			if(min>qual[i]){
				min = qual[i];
			}
		}

		printf("%d\n",min);
	}
	
	return 0;
}
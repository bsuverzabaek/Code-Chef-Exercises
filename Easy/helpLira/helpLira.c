#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int main(void){
	int N,ans,max,min,max_index,min_index;
	int x1,x2,x3,y1,y2,y3;

	scanf("%d",&N);
	assert(N>=2 && N<=100);

	min = 10000;
	max = -1;

	for(int i=0;i<N;i++){
		scanf("%d %d %d %d %d %d",&x1,&y1,&x2,&y2,&x3,&y3);

		assert(x1>=-1000 && x1<=1000 && x2>=-1000 && x2<=1000 && x3>=-1000 && x3<=1000);
		assert(y1>=-1000 && y1<=1000 && y2>=-1000 && y2<=1000 && y3>=-1000 && y3<=1000);

		ans = x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
		ans = abs(ans)/2;

		if(ans>=max){
			max = ans;
			max_index = i;
		}

		if(ans<=min){
			min = ans;
			min_index = i;
		}	
	}

	printf("%d %d\n",min_index+1,max_index+1);
	
	return 0;
}